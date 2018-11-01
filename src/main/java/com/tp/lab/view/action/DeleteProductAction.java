package com.tp.lab.view.action;

import com.tp.lab.dal.Repository;
import com.tp.lab.model.products.Product;
import com.tp.lab.model.utility.Printer;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeleteProductAction implements Action {

    @Override
    public void execute() {
        Printer.printActiveProducts();
        final Scanner scan = new Scanner(System.in);
        long choice;
        System.out.println("ID of product to be deleted: ");
        choice = scan.nextLong();
        final List<Product> result = Repository.getProducts().stream().filter(p -> p.getID() == choice).collect(Collectors.toList());
        if(result.isEmpty()) {
            System.out.println("You entered an incorrect ID.");
        }
        else {
            final Product toBeDeleted = result.get(0);
            Repository.deleteProduct(toBeDeleted);
            System.out.println("Product with id "+ toBeDeleted + "deleted successfully.");

        }
    }
}
