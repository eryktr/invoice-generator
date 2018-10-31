package com.tp.lab.View.Action;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Products.Product;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeleteProductAction extends ShowProductsAction {
    @Override
    public void execute() {
        super.execute();
        Scanner scan = new Scanner(System.in);
        long choice;
        System.out.println("ID of product to be deleted: ");
        choice = scan.nextLong();
        List<Product> result = Repository.getProducts().stream().filter(p -> p.getID() == choice).collect(Collectors.toList());
        if(result.isEmpty()) {
            System.out.println("You entered an incorrect ID.");
            return;
        }
        else {
            Product toBeDeleted = result.get(0);
            Repository.deleteProduct(toBeDeleted);
            System.out.println("Product with id "+ toBeDeleted + "deleted successfully.");

        }
    }
}