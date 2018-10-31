package com.tp.lab.DAL;

import com.tp.lab.Model.Bill;
import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Products.Product;


import java.util.ArrayList;
import java.util.List;

public final class Repository {
    private Repository() {}

    private static ArrayList<Bill> bills;
    private static ArrayList<Client> clients;
    private static ArrayList<Product>  products;

    public static List<Bill> getBills() {
        return bills;
    }

    public static List<Client> getClients() {
        return clients;
    }

    public static void addClient(Client c) {
        clients.add(c);
    }

    public static  void addBill(Bill b) {
        bills.add(b);
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static void addProduct(Product p) {
        products.add(p);
    }

}
