package com.tp.lab.Model;

import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Products.Product;
import com.tp.lab.Model.Utility.Printer;
import com.tp.lab.Model.Utility.UniqueIDGenerator;

import java.util.List;

public final class Bill {
    private long ID;
    private UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private Client client;
    private Order order;



    public Bill(Client client, Order order) {
        this.ID = idGenerator.getUniqueId();
        this.client = client;
        this.order = order;
    }

    public double getTotalPrice() {
        return order.getTotalPrice();
    }

    public void print() {
        Printer.printBill(this);
    }

    public Client getClient() {
        return client;
    }

    public List<Product> getProducts() {
        return order.getProducts();
    }



}
