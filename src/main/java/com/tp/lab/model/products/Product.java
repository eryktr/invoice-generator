package com.tp.lab.model.products;

import com.tp.lab.model.PrintMode;
import com.tp.lab.model.Printable;
import com.tp.lab.model.utility.Constants;
import com.tp.lab.model.utility.UniqueIDGenerator;

public final class Product implements Printable {
    private final long ID;
    private final static UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private String name;
    private double price;
    private boolean isAvailable;

    public Product(final String name, final double price) {
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
    public void print(PrintMode mode) {
        System.out.println("ID: "+ ID);
        System.out.println("Name: "+ name);
        System.out.println("Price: "+ price + Constants.CURRENCY_STRING);
        if(mode == PrintMode.Detailed) {
            System.out.println("Available: " + isAvailable);
        }
        System.out.println(Constants.UNDERLINE_STRING);
    }

    public void deactivate() {
        isAvailable = false;
    }

    public boolean isActive() {
        return isAvailable;
    }
}