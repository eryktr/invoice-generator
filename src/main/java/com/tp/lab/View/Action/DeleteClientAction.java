package com.tp.lab.View.Action;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Client.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeleteClientAction implements Action{
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("---------- DELETE CLIENT ----------");
        long clientID = in.nextLong();
        List<Client> allCLients = Repository.getClients();

        List<Client> foundClients = allCLients.stream().filter(c -> c.getId() == clientID).collect(Collectors.toList());
        if(foundClients.isEmpty()) {
            System.out.println("No such client exists.");
            return;
        }
        Repository.deleteClient(foundClients.get(0));
        System.out.println("Client removed successfully.");
        in.close();
    }
}
