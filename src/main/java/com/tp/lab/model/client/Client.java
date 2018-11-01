package com.tp.lab.model.client;

import com.tp.lab.model.PrintMode;
import com.tp.lab.model.Printable;
import com.tp.lab.model.utility.Constants;
import com.tp.lab.model.utility.UniqueIDGenerator;

public final class Client implements Printable {
    private final long id;
    private String firstName;
    private String lastName;
    private Address address;
    private Boolean isActive;

    private static UniqueIDGenerator idGenerator = new UniqueIDGenerator();

    public Client(final String firstName, final String lastName, final Address address) {
        this.id = idGenerator.getUniqueId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.isActive = true;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private String getCountry() {
        return address.getCountry();
    }

    private String getCity() {
        return address.getCity();
    }

    private String getStreet() {
        return address.getStreet();
    }

    private String getHomeNumber() {
        return address.getHomeNumber();
    }

    public Long getId() {
        return id;
    }


    public void deactivate() {
        isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public void print(PrintMode mode) {
        System.out.println("ID: " + id);
        if (mode == PrintMode.Detailed) {
            System.out.println("Active: " + isActive);
        }
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Country: " + getCountry());
        System.out.println("City: " + getCity());
        System.out.println("Street: " + getStreet());
        System.out.println("Home number: " + getHomeNumber());
        System.out.println(Constants.UNDERLINE_STRING);
    }

}
