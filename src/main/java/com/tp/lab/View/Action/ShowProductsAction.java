package com.tp.lab.View.Action;

import com.tp.lab.Model.Utility.Printer;

public class ShowProductsAction implements Action {
    @Override
    public void execute() {
        Printer.printAllProducts();
    }
}
