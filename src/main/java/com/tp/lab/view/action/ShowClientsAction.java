package com.tp.lab.view.action;

import com.tp.lab.model.utility.Printer;

public class ShowClientsAction implements Action {

    @Override
    public void execute() {
        Printer.printAllClients();
    }
}
