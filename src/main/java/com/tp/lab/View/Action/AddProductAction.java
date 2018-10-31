package com.tp.lab.View.Action;

import com.tp.lab.Model.Products.Product;

import java.util.Scanner;

public class AddProductAction implements Action {

    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Price: ");
        double price = scan.nextDouble();
        Product p = new Product(name, price);

    }
}
