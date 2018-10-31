package com.tp.lab.View.Action;

import com.tp.lab.Model.Utility.Printer;

public class ShowClientsAction implements Action {

    @Override
    public void execute() {
        Printer.printAllClients();
    }
}
