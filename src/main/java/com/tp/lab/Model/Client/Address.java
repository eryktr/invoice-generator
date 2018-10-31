package com.tp.lab.Model.Client;

import com.tp.lab.Model.Utility.UniqueIDGenerator;

public final class Address {
    private long ID;
    private static UniqueIDGenerator idGenerator = new UniqueIDGenerator();
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

    public long getID() {
        return ID;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }
}
