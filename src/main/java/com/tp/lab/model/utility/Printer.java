package com.tp.lab.model.utility;

import com.tp.lab.dal.Repository;
import com.tp.lab.model.PrintMode;
import com.tp.lab.model.Printable;
public final class Printer {
    private Printer() {}

    public static void printAllProducts() {
        System.out.println("LIST OF PRODUCTS: ");
        System.out.println(Constants.UNDERLINE_STRING);
        for(final Printable p : Repository.getAllProducts()) {
            p.print(PrintMode.Detailed);
        }
    }

    public static void printAllClients() {
        System.out.println("LIST OF CLIENTS: ");
        System.out.println(Constants.UNDERLINE_STRING);
        for(final Printable c : Repository.getAllClients()) {
            c.print(PrintMode.Detailed);
        }
    }

    public static void printAllBills() {
        System.out.println("LIST OF BILLS: ");
        System.out.println(Constants.UNDERLINE_STRING);
        for(final Printable b : Repository.getAllBills()) {
            b.print(PrintMode.Detailed);
        }
    }

    public static void printActiveProducts() {
        System.out.println("LIST OF PRODUCTS: ");
        System.out.println(Constants.UNDERLINE_STRING);
        for(final Printable p : Repository.getProducts()) {
            p.print(PrintMode.Simple);
        }
    }

    public static void printActiveClients() {
        System.out.println("LIST OF CLIENTS: ");
        System.out.println(Constants.UNDERLINE_STRING);
        for(final Printable c : Repository.getClients()) {
            c.print(PrintMode.Simple);
        }
    }

    public static void printActiveBills() {
        System.out.println("LIST OF BILLS: ");
        System.out.println(Constants.UNDERLINE_STRING);
        for(final Printable b : Repository.getBills()) {
            b.print(PrintMode.Simple);
        }
    }
}
