package com.tp.lab.Model.Products;

import com.tp.lab.Model.Printable;
import com.tp.lab.Model.Utility.Constants;
import com.tp.lab.Model.Utility.UniqueIDGenerator;

public final class Product implements Printable {
    private long ID;
    private static UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private String name;
    private double price;
    private boolean isAvailable;

    public Product(String name, double price) {
        this.ID = idGenerator.getUniqueId();
        this.name = name;
        this.price = price;
        this.isAvailable = true;
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

    @Override
    public void print() {
        System.out.println("ID: "+ ID);
        System.out.println("Name: "+ name);
        System.out.println("Price: "+ price + Constants.CurrencyString);
        System.out.println("Available: " + isAvailable);
        System.out.println(Constants.UnderlineString);
    }

    public void activate() {
        isAvailable = true;
    }

    public void deactivate() {
        isAvailable = false;
    }

    public boolean isActive() {
        return isAvailable;
    }
}
