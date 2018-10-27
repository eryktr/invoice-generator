package com.tp.lab.Model.Utility;

import com.tp.lab.Model.Bill;
import com.tp.lab.Model.Products.Product;

import java.util.ArrayList;
import java.util.List;

public final class Printer {
    private Printer() {}

    public static void printBill(Bill bill) {
        List<Product> productCopy = new ArrayList<>(bill.getProducts());

        for(int i = 0; i < productCopy.size(); i++) {
            Product currentProduct = productCopy.get(i);
            int counter = 1;
            System.out.println("------------------------------");
            for(int j = i+1; j < productCopy.size(); j++) {

                Product compareProduct = productCopy.get(j);
                if(compareProduct.getClass().getName().equals(currentProduct.getClass().getName())) {
                    counter++;
                    productCopy.remove(j);
                    j--;
                }
            }
            System.out.println(currentProduct.getName() + " " + counter + " " + counter * currentProduct.getPrice());
            System.out.println("------------------------------");
        }
    }
}
