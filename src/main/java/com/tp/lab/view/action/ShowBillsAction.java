package com.tp.lab.view.action;

import com.tp.lab.dal.Repository;
import com.tp.lab.model.Bill;
import com.tp.lab.model.client.Client;
import com.tp.lab.model.PrintMode;
import com.tp.lab.model.utility.Printer;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShowBillsAction implements Action {

    @Override
    public void execute() {
        final Scanner scan = new Scanner(System.in);
        Printer.printAllClients();
        System.out.println("Choose client's ID. Choose [0] to print all bills.");
        final long choice = scan.nextLong();
        if(choice == 0) {
            Printer.printAllBills();
        }
        else {
            final List<Client> clientResult = Repository.getAllClients().stream().filter(c -> c.getId() == choice).collect(Collectors.toList());
            if(clientResult.isEmpty()) {
                System.out.println("client doesn't exist");
            }
            else {
                final List<Bill> billResult = Repository.getAllBills().stream().filter(b -> b.getClient().getId() == choice)
                        .collect(Collectors.toList());
                if (billResult.isEmpty()) {
                    System.out.println("This client doesn't have any bills ");
                }
                else {
                    for(final Bill b : billResult) {
                        b.print(PrintMode.Detailed);
                    }
                }
            }
        }
    }
}
