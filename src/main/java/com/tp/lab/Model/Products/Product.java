package com.tp.lab.Model.Products;

import com.tp.lab.Model.Utility.UniqueIDGenerator;

public final class Product {
    private long ID;
    private UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private String name;
    private double price;


    public Product(String name, int price) {
        this.ID = idGenerator.getUniqueId();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getID() {
        return ID;
    }



}
