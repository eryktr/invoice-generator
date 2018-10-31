package com.tp.lab.Model.Utility;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Printable;
public final class Printer {
    private Printer() {}

    public static void printAllProducts() {
        System.out.println("LIST OF PRODUCTS: ");
        System.out.println(Constants.UnderlineString);
        for(Printable p : Repository.getAllProducts()) {
            p.print();
        }
    }

    public static void printAllClients() {
        System.out.println("LIST OF CLIENTS: ");
        System.out.println(Constants.UnderlineString);
        for(Printable c : Repository.getAllClients()) {
            c.print();
        }
    }

    public static void printAllBills() {
        System.out.println("LIST OF BILLS: ");
        System.out.println(Constants.UnderlineString);
        for(Printable b : Repository.getAllBills()) {
            b.print();
        }
    }

    public static void printActiveProducts() {
        System.out.println("LIST OF PRODUCTS: ");
        System.out.println(Constants.UnderlineString);
        for(Printable p : Repository.getProducts()) {
            p.print();
        }
    }

    public static void printActiveClients() {
        System.out.println("LIST OF CLIENTS: ");
        System.out.println(Constants.UnderlineString);
        for(Printable c : Repository.getClients()) {
            c.print();
        }
    }

    public static void printActiveBills() {
        System.out.println("LIST OF BILLS: ");
        System.out.println(Constants.UnderlineString);
        for(Printable b : Repository.getBills()) {
            b.print();
        }
    }
}
