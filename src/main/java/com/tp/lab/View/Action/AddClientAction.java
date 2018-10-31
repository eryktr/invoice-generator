package com.tp.lab.View.Action;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Client.Address;
import com.tp.lab.Model.Client.Client;
import com.tp.lab.Model.Utility.Constants;

import java.util.Scanner;

public final class AddClientAction implements Action {
    @Override
    public void execute() {
        String first_name, last_name, country, city, street, homeNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("---------- ADDING CLIENT ----------");
        System.out.print("First_name: ");
        System.out.println();
        first_name = in.nextLine();
        System.out.print("Last name: ");
        System.out.println();
        last_name = in.nextLine();
        System.out.print("Country: ");
        System.out.println();
        country = in.nextLine();
        System.out.print("City: ");
        System.out.println();
        city = in.nextLine();
        System.out.print("Street: ");
        System.out.println();
        street = in.nextLine();
        System.out.print("Home number: ");
        System.out.println();
        homeNumber = in.nextLine();

        Client c = new Client(first_name, last_name, new Address(country, city, street, homeNumber));
        Repository.addClient(c);
        System.out.println("CLIENT " + c.getFirstName() + " " + c.getLastName() + " ADDED SUCCESSFULLY");
        System.out.println(Constants.UnderlineString);

    }
}
