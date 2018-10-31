package com.tp.lab.Model.Utility;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Bill;
import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Products.Product;

import java.util.ArrayList;
import java.util.List;

public final class Printer {
    private Printer() {}

    public static void printBill(Bill bill) {
        Client client = bill.getClient();
        List<Product> productCopy = new ArrayList<>(bill.getProducts());

        System.out.println("PRODUCTS");
        for(int i = 0; i < productCopy.size(); i++) {
            Product currentProduct = productCopy.get(i);
            int counter = 1;
            System.out.println(Constants.UnderlineString);
            for(int j = i+1; j < productCopy.size(); j++) {

                Product compareProduct = productCopy.get(j);
                if(compareProduct.getID() == currentProduct.getID()) {
                    counter++;
                    productCopy.remove(j);
                    j--;
                }
            }
            System.out.println(currentProduct.getName() + " " + counter + " " + counter * currentProduct.getPrice() + Constants.CurrencyString);
            client.print();
        }
        System.out.println(Constants.UnderlineString);
        System.out.println("TOTAL PRICE: "+ bill.getTotalPrice());
        System.out.println(Constants.UnderlineString);
        System.out.println("CLIENT");
        client.print();

    }

    public static void printAllProducts() {
        System.out.println("LIST OF PRODUCTS: ");
        System.out.println(Constants.UnderlineString);
        for(Product p : Repository.getProducts()) {
            System.out.println("ID: "+ p.getID());
            System.out.println("Name: "+ p.getName());
            System.out.println("Price: "+ p.getPrice() + Constants.CurrencyString);
            System.out.println(Constants.UnderlineString);
        }
    }

    public static void printAllClients() {
        System.out.println("LIST OF CLIENTS: ");
        System.out.println(Constants.UnderlineString);
        for(Client c : Repository.getClients()) {
            c.print();
        }
    }

    public static void printClient(Client c) {
        System.out.println("ID: " + c.getId());
        System.out.println("First name: "+c.getFirstName());
        System.out.println("Last name: "+c.getLastName());
        System.out.println("Country: " + c.getCountry());
        System.out.println("City: " + c.getCity());
        System.out.println("Street: " + c.getStreet());
        System.out.println("Home number: "+ c.getHomeNumber());
        System.out.println(Constants.UnderlineString);
    }
}
