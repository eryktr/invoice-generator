package com.tp.lab.model;

import com.tp.lab.model.products.Product;
import com.tp.lab.model.utility.Constants;
import com.tp.lab.model.utility.UniqueIDGenerator;

import java.util.ArrayList;
import java.util.List;

public final class Order implements Printable {

    private final long ID;
    private final static UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private final List<Product> products;


    public Order(final List<Product> products) {
        this.ID = idGenerator.getUniqueId();
        this.products = products;
    }

    public double getTotalPrice() {
        double price = 0;
        for(final Product p : products) {
            price += p.getPrice();
        }
        return price;
    }

    @Override
    public void print(final PrintMode mode) {
        final List<Product> productCopy = new ArrayList<>(products);
        System.out.println("PRODUCTS");
        for(int i = 0; i < productCopy.size(); i++) {
            final Product currentProduct = productCopy.get(i);
            int counter = 1;
            System.out.println(Constants.UNDERLINE_STRING);
            for(int j = i+1; j < productCopy.size(); j++) {

                final Product compareProduct = productCopy.get(j);
                if(compareProduct.getID() == currentProduct.getID()) {
                    counter++;
                    productCopy.remove(j);
                    j--;
                }
            }
            System.out.println("Product: " + currentProduct.getName());
            System.out.println("Quantity: " + counter);
            System.out.println("Price: " + Math.round(100.0 * counter * currentProduct.getPrice()) / 100 + Constants.CURRENCY_STRING);
            System.out.println(Constants.UNDERLINE_STRING);
        }
        System.out.println(Constants.UNDERLINE_STRING);
        System.out.println("Total price: "+ Math.round(100.0 * getTotalPrice()) / 100 + Constants.CURRENCY_STRING);
        System.out.println(Constants.UNDERLINE_STRING);
    }
}
