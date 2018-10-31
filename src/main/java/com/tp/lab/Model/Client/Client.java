package com.tp.lab.Model.Client;

import com.tp.lab.Model.Printable;
import com.tp.lab.Model.Utility.Constants;
import com.tp.lab.Model.Utility.Printer;
import com.tp.lab.Model.Utility.UniqueIDGenerator;

public final class Client implements Printable {
    private String firstName;
    private String lastName;
    private Address address;
    private Long id;
    private UniqueIDGenerator idGenerator = new UniqueIDGenerator();

    public Client(String firstName, String lastName, Address address) {
        this.id = idGenerator.getUniqueId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return address.getCountry();
    }

    public String getCity() {
        return address.getCity();
    }

    public String getStreet() {
        return address.getStreet();
    }

    public String getHomeNumber() {
        return address.getHomeNumber();
    }

    public Long getId() {
        return id;
    }

    @Override
    public void print() {
        System.out.println("ID: " + getId());
        System.out.println("First name: "+ getFirstName());
        System.out.println("Last name: "+ getLastName());
        System.out.println("Country: " +  getCountry());
        System.out.println("City: " +  getCity());
        System.out.println("Street: " + getStreet());
        System.out.println("Home number: "+ getHomeNumber());
        System.out.println(Constants.UnderlineString);
    }

}
