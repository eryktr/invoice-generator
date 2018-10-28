package com.tp.lab.Model;

public class Client {
    private String firstName;
    private String lastName;
    private Address address;
    private Long id;
    private static long next_id = 1;

    private static long getUniqueId() {
        return next_id++;
    }

    public Client() {
    }

    public Client(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        id = getUniqueId();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Long getId() {
        return id;
    }
}
