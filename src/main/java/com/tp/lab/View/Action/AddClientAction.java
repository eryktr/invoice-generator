package com.tp.lab.View.Action;

import com.tp.lab.DAL.Repository;
import com.tp.lab.Model.Address;
import com.tp.lab.Model.Client;

import java.util.Scanner;

public class AddClientAction implements Action {
    @Override
    public void execute() {
        String first_name, last_name, country, city, street, homeNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("---------- ADDING CLIENT ----------");
        System.out.print("First_name: ");
        first_name = in.nextLine();
        System.out.print("Last name: ");
        last_name = in.nextLine();
        System.out.print("Country: ");
        country = in.nextLine();
        System.out.print("City: ");
        city = in.nextLine();
        System.out.print("Street: ");
        street = in.nextLine();
        System.out.print("Home number: ");
        homeNumber = in.nextLine();

        Client c = new Client(first_name, last_name, new Address(country, city, street, homeNumber));
        System.out.println("CLIENT " + c.getFirstName() + " " + c.getLastName() + " ADDED SUCCESSFULLY");
    }
}
