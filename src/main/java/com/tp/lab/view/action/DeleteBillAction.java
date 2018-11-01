package com.tp.lab.view.action;

import com.tp.lab.dal.Repository;
import com.tp.lab.model.Bill;
import com.tp.lab.model.utility.Printer;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeleteBillAction implements Action {

    @Override
    public void execute() {
        Printer.printActiveBills();
        final Scanner scan = new Scanner(System.in);
        System.out.print("Bill id: ");
        final long id = scan.nextLong();

        final List<Bill> result = Repository.getBills().stream().filter(b -> b.getID() == id).collect(Collectors.toList());
        if(result.isEmpty()) {
            System.out.println("You have entered incorrect ID");
        }
        else {
            final Bill target = result.get(0);
            target.deactivate();
            System.out.println("Bill has been removed");
        }


    }
}
