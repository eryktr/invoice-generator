package com.tp.lab.view.action;

import com.tp.lab.model.utility.Printer;

public class ShowProductsAction implements Action {
    @Override
    public void execute() {
        Printer.printAllProducts();
    }
}
