package com.tp.lab.Model.Utility;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Printable;
public final class Printer {
    private Printer() {}

    public static void printAllProducts() {
        System.out.println("LIST OF PRODUCTS: ");
        System.out.println(Constants.UnderlineString);
        for(Printable p : Repository.getProducts()) {
            p.print();
        }
    }

    public static void printAllClients() {
        System.out.println("LIST OF CLIENTS: ");
        System.out.println(Constants.UnderlineString);
        for(Client c : Repository.getClients()) {
            c.print();
        }
    }
}
