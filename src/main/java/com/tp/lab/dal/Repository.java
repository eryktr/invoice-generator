package com.tp.lab.dal;

import com.tp.lab.model.Bill;
import com.tp.lab.model.client.Client;
import com.tp.lab.model.products.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Repository {

    private static List<Bill> bills = new ArrayList<>();
    private static List<Client> clients = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();

    private Repository() {
    }



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

    public static void addClient(final Client client) {
        clients.add(client);
    }

    public static void addBill(final Bill bill) {
        bills.add(bill);
    }

    public static void addProduct(final Product product) {
        products.add(product);
    }

    public static void deleteProduct(final Product product) {
        final int index = products.indexOf(product);
        products.get(index).deactivate();
    }

    public static void deleteClient(final Client client) {
        final int index = clients.indexOf(client);
        clients.get(index).deactivate();
    }

    public static void deleteBill(final Bill bill) {
        final int index = bills.indexOf(bill);
        bills.get(index).deactivate();
    }


}
