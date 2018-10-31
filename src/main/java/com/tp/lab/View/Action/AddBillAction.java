package com.tp.lab.View.Action;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Bill;
import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Order;
import com.tp.lab.Model.Products.Product;
import com.tp.lab.Model.Utility.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class AddBillAction implements Action {

    @Override
    public void execute() {
        boolean continueAdding = true;
        List<Product> products = new ArrayList<>();
        Client targetClient = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Keep adding products. Choose [0] when everything has been added.");
        Printer.printActiveProducts();
        while(continueAdding) {
            System.out.println("Product ID: ");
            long id = scan.nextLong();
            if(id == 0) {
                if(products.isEmpty()) {
                    System.out.println("You added no products.");
                    return;
                }

                continueAdding = false;
                continue;
            }
            List<Product> result = Repository.getProducts().stream().filter(p -> p.getID() == id).collect(Collectors.toList());
            if (result.isEmpty()) {
                System.out.println("Incorrect id.");
            }
            else {

                Product toAdd = result.get(0);
                System.out.print("Quantity: ");
                int i = scan.nextInt();
                int j = i;
                while(j>0) {
                    products.add(toAdd);
                    j--;
                }
                System.out.println(i + "x" + toAdd.getName() + " Added successfully");
            }
        }
        Printer.printAllClients();
        boolean clientChosen = false;
        while(!clientChosen) {
            System.out.println("Target client ID:  ");
            long clientID = scan.nextLong();
            List<Client> result = Repository.getClients().stream().filter(c -> c.getId() == clientID).collect(Collectors.toList());
            if (result.isEmpty()) {
                System.out.println("Incorrect client id!");
            }
            else {
                targetClient = result.get(0);
                clientChosen = true;
            }
        }
        Order order = new Order(products);
        Bill bill = new Bill(targetClient, order);
        Repository.addBill(bill);
        System.out.println("Bill has been added successfully!");
    }
}
