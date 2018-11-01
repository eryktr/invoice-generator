package com.tp.lab.view.action;

import com.tp.lab.dal.Repository;
import com.tp.lab.model.client.Client;
import com.tp.lab.model.utility.Printer;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeleteClientAction implements Action{

    @Override
    public void execute() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("---------- DELETE CLIENT ----------");
        Printer.printActiveClients();
        System.out.println("client id: ");
        final long clientID = scanner.nextLong();
        final List<Client> allClients = Repository.getClients();

        final List<Client> foundClients = allClients.stream().filter(c -> c.getId() == clientID).collect(Collectors.toList());
        if(foundClients.isEmpty()) {
            System.out.println("No such client exists.");
            return;
        }
        Repository.deleteClient(foundClients.get(0));
        System.out.println("client removed successfully.");
    }
}
