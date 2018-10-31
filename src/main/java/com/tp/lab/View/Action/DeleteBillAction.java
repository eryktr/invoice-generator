package com.tp.lab.View.Action;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Bill;
import com.tp.lab.Model.Utility.Printer;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeleteBillAction implements Action {

    @Override
    public void execute() {
        Printer.printActiveBills();
        Scanner scan = new Scanner(System.in);
        System.out.print("Bill id: ");
        long id = scan.nextLong();

        List<Bill> result = Repository.getBills().stream().filter(b -> b.getID() == id).collect(Collectors.toList());
        if(result.isEmpty()) {
            System.out.println("You have entered incorrect ID");
        }
        else {
            Bill target = result.get(0);
            target.deactivate();
            System.out.println("Bill has been removed");
        }


    }
}
