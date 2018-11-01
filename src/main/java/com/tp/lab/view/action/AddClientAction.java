package com.tp.lab.view.action;

import com.tp.lab.dal.Repository;
import com.tp.lab.model.client.Address;
import com.tp.lab.model.client.Client;
import com.tp.lab.model.utility.Constants;

import java.util.Scanner;

public final class AddClientAction implements Action {
    @Override
    public void execute() {
        String first_name, last_name, country, city, street, homeNumber;
        final Scanner scanner = new Scanner(System.in);
        System.out.println("---------- ADDING CLIENT ----------");
        System.out.print("First_name: ");
        System.out.println();
        first_name = scanner.nextLine();
        System.out.print("Last name: ");
        System.out.println();
        last_name = scanner.nextLine();
        System.out.print("Country: ");
        System.out.println();
        country = scanner.nextLine();
        System.out.print("City: ");
        System.out.println();
        city = scanner.nextLine();
        System.out.print("Street: ");
        System.out.println();
        street = scanner.nextLine();
        System.out.print("Home number: ");
        System.out.println();
        homeNumber = scanner.nextLine();

        final Client client = new Client(first_name, last_name, new Address(country, city, street, homeNumber));
        Repository.addClient(client);
        System.out.println("CLIENT " + client.getFirstName() + " " + client.getLastName() + " ADDED SUCCESSFULLY");
        System.out.println("ID: " + client.getId());
        System.out.println(Constants.UNDERLINE_STRING);

    }
}
