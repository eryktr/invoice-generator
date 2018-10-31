package com.tp.lab.View.Action;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Bill;
import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Utility.Printer;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShowBillsAction implements Action {

    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        Printer.printAllClients();
        System.out.println("Choose client's ID. Choose [0] to print all bills.");
        long choice = scan.nextLong();
        if(choice == 0) {
            Printer.printAllBills();
        }
        else {
            List<Client> clientResult = Repository.getAllClients().stream().filter(c -> c.getId() == choice).collect(Collectors.toList());
            if(clientResult.isEmpty()) {
                System.out.println("Client doesn't exist");
            }
            else {
                List<Bill> billResult = Repository.getAllBills().stream().filter(b -> b.getClient().getId() == choice)
                        .collect(Collectors.toList());
                if (billResult.isEmpty()) {
                    System.out.println("This client doesn't have any bills ");
                }
                else {
                    for(Bill b : billResult) {
                        b.print();
                    }
                }
            }
        }
    }
}
