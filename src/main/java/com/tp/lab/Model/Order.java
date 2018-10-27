package com.tp.lab.Model;

import com.tp.lab.Model.Products.Product;
import java.util.List;

public class Order {

    private List<Product> products;


    public Order(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return 0;
    }

    public double getPartialPrice() {
        return 0;
    }







}
