package com.tp.lab.view.action;

import com.tp.lab.dal.Repository;
import com.tp.lab.model.Bill;
import com.tp.lab.model.client.Client;
import com.tp.lab.model.Order;
import com.tp.lab.model.products.Product;
import com.tp.lab.model.utility.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class AddBillAction implements Action {

    @Override
    public void execute() {
        boolean continueAdding = true;
        final List<Product> products = new ArrayList<>();
        Client targetClient = null;
        final Scanner scan = new Scanner(System.in);
        System.out.println("Keep adding products. Choose [0] when everything has been added.");
        Printer.printActiveProducts();
        while(continueAdding) {
            System.out.println("Product ID: ");
            final long id = scan.nextLong();
            if(id == 0) {
                if(products.isEmpty()) {
                    System.out.println("You added no products.");
                    return;
                }

                continueAdding = false;
                continue;
            }
            final List<Product> result = Repository.getProducts().stream().filter(p -> p.getID() == id).collect(Collectors.toList());
            if (result.isEmpty()) {
                System.out.println("Incorrect id.");
            }
            else {

                final Product toAdd = result.get(0);
                System.out.print("Quantity: ");
                final int i = scan.nextInt();
                int j = i;
                while(j>0) {
                    products.add(toAdd);
                    j--;
                }
                System.out.println(i + "x" + toAdd.getName() + " Added successfully");
            }
        }
        Printer.printActiveClients();
        boolean clientChosen = false;
        while(!clientChosen) {
            System.out.println("Target client ID:  ");
            final long clientID = scan.nextLong();
            final List<Client> result = Repository.getClients().stream().filter(c -> c.getId() == clientID).collect(Collectors.toList());
            if (result.isEmpty()) {
                System.out.println("Incorrect client id!");
            }
            else {
                targetClient = result.get(0);
                clientChosen = true;
            }
        }
        final Order order = new Order(products);
        final Bill bill = new Bill(targetClient, order);
        Repository.addBill(bill);
        System.out.println("Bill has been added successfully!");
    }
}
