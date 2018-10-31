package com.tp.lab.Model;

import com.tp.lab.Model.Products.Product;
import com.tp.lab.Model.Utility.UniqueIDGenerator;

import java.util.List;

public final class Order {

    private long ID;
    private UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private List<Product> products;


    public Order(List<Product> products) {
        this.ID = idGenerator.getUniqueId();
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        double price = 0;
        for(Product p : products) {
            price += p.getPrice();
        }
        return price;
    }

}
