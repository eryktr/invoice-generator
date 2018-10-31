package com.tp.lab.View.Action;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Products.Product;
import com.tp.lab.Model.Utility.Constants;

public class ShowProductsAction implements Action {
    @Override
    public void execute() {
        System.out.println("LIST OF PRODUCTS: ");
        System.out.println(Constants.UnderlineString);
        for(Product p : Repository.getProducts()) {
            System.out.println("ID: "+ p.getID());
            System.out.println("Name: "+ p.getName());
            System.out.println("Price: "+ p.getPrice() + Constants.CurrencyString);
            System.out.println(Constants.UnderlineString);
        }
    }
}
