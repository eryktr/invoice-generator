package com.tp.lab.View.Action;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Products.Product;
import com.tp.lab.Model.Utility.Constants;
import com.tp.lab.Model.Utility.Printer;

public class ShowProductsAction implements Action {
    @Override
    public void execute() {
        Printer.printAllProducts();
    }
}
