package com.tp.lab.Model.Client;

import com.tp.lab.Model.Utility.UniqueIDGenerator;

public final class Address {
    private long ID;
    private UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private String country;
    private String city;
    private String street;
    private String homeNumber;


    public Address(String country, String city, String street, String homeNumber) {
        ID = idGenerator.getUniqueId();
        this.country = country;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }
}
