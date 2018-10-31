package com.tp.lab.Model;

import com.tp.lab.Model.Products.Product;
import com.tp.lab.Model.Utility.Constants;
import com.tp.lab.Model.Utility.UniqueIDGenerator;

import java.util.ArrayList;
import java.util.List;

public final class Order implements Printable {

    private long ID;
    private static UniqueIDGenerator idGenerator = new UniqueIDGenerator();
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

    @Override
    public void print() {
        List<Product> productCopy = new ArrayList<>(products);
        System.out.println("PRODUCTS");
        for(int i = 0; i < productCopy.size(); i++) {
            Product currentProduct = productCopy.get(i);
            int counter = 1;
            System.out.println(Constants.UnderlineString);
            for(int j = i+1; j < productCopy.size(); j++) {

                Product compareProduct = productCopy.get(j);
                if(compareProduct.getID() == currentProduct.getID()) {
                    counter++;
                    productCopy.remove(j);
                    j--;
                }
            }
            System.out.println("Product: " + currentProduct.getName());
            System.out.println("Quantity: " + counter);
            System.out.println("Price: " + Math.round(100.0 * counter * currentProduct.getPrice()) / 100 + Constants.CurrencyString);
            System.out.println(Constants.UnderlineString);
        }
        System.out.println(Constants.UnderlineString);
        System.out.println("Total price: "+ Math.round(100.0 * getTotalPrice()) / 100 + Constants.CurrencyString);
        System.out.println(Constants.UnderlineString);
    }
}
