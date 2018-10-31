package com.tp.lab.Model;

import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Products.Product;
import com.tp.lab.Model.Utility.Constants;
import com.tp.lab.Model.Utility.Printer;
import com.tp.lab.Model.Utility.UniqueIDGenerator;

import java.util.List;

public final class Bill implements Printable {
    private long ID;
    private static UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private Client client;
    private Order order;
    private boolean isPaid;


    public Bill(Client client, Order order) {
        this.ID = idGenerator.getUniqueId();
        this.client = client;
        this.order = order;
        this.isPaid = false;
    }

    public double getTotalPrice() {
        return order.getTotalPrice();
    }

    public long getID() {
        return ID;
    }

    public Client getClient() {
        return client;
    }

    public List<Product> getProducts() {
        return order.getProducts();
    }

    public void activate() {
        isPaid = false;
    }

    public void deactivate() {
        isPaid = true;
    }

    public boolean isActive() {
        return !isPaid;
    }

    @Override
    public void print() {
        System.out.println("Bill id: "+ID);
        order.print();
        client.print();
        System.out.println("Is paid: "+isPaid);
    }
}
