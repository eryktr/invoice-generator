package com.tp.lab.Model;

import com.tp.lab.Model.Products.Product;
import com.tp.lab.Model.Utility.Printer;

import java.util.List;

public class Bill {
    private Client client;
    private Order order;
    private long ID;
    private static long next_id = 1;

    private static long getUniqueId() {
        return next_id++;
    }

    public Bill(Client client, Order order) {
        ID = getUniqueId();
        this.client = client;
        this.order = order;
    }

    public void print() {
        Printer.printBill(this);
    }

    public List<Product> getProducts() {
        return order.getProducts();
    }


}
