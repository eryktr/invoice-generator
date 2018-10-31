package com.tp.lab.DAL;

import com.tp.lab.Model.Bill;
import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Products.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Repository {
    private Repository() {
    }

    private static List<Bill> bills = new ArrayList<>();
    private static List<Client> clients = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();

    public static List<Bill> getBills() {
        return bills.stream().filter(Bill::isActive).collect(Collectors.toList());
    }

    public static List<Client> getClients() {
        return clients.stream().filter(Client::isActive).collect(Collectors.toList());
    }

    public static List<Product> getProducts() {
        return products.stream().filter(Product::isActive).collect(Collectors.toList());
    }

    public static List<Bill> getAllBills() {
        return bills;
    }

    public static List<Client> getAllClients() {
        return clients;
    }

    public static List<Product> getAllProducts() {
        return products;
    }

    public static void addClient(Client c) {
        clients.add(c);
    }

    public static void addBill(Bill b) {
        bills.add(b);
    }

    public static void addProduct(Product p) {
        products.add(p);
    }

    public static void deleteProduct(Product p) {
        int index = products.indexOf(p);
        products.get(index).deactivate();
    }

    public static void deleteClient(Client c) {
        int index = clients.indexOf(c);
        clients.get(index).deactivate();
    }

    public static void deleteBill(Bill b) {
        int index = bills.indexOf(b);
        bills.get(index).deactivate();
    }


}
