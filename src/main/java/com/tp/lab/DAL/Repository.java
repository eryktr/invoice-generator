package com.tp.lab.DAL;

import com.tp.lab.Model.Bill;
import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Products.Product;


import java.util.ArrayList;
import java.util.List;

public final class Repository {
    private Repository() {}

    private static List<Bill> bills = new ArrayList<>();
    private static List<Client> clients = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();

    public static List<Bill> getBills() {
        return bills;
    }

    public static List<Client> getClients() {
        return clients;
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static void addClient(Client c) {
        clients.add(c);
    }

    public static  void addBill(Bill b) {
        bills.add(b);
    }

    public static void addProduct(Product p) {
        products.add(p);
    }

    public static void deleteProduct(Product p) {
        products.remove(p);
    }

    public static void deleteClient(Client c) {
        clients.remove(c);
    }

    public static void deleteBill(Bill b) {
        bills.remove(b);
    }


}
