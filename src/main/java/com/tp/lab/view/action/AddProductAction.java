package com.tp.lab.view.action;

import com.tp.lab.dal.Repository;
import com.tp.lab.model.products.Product;

import java.util.Scanner;

public class AddProductAction implements Action {

    @Override
    public void execute() {
        final Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        final String name = scan.nextLine();
        System.out.print("Price: ");
        final double price = scan.nextDouble();
        final Product product = new Product(name, price);
        Repository.addProduct(product);

    }
}
