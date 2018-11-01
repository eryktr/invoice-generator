package com.tp.lab.model.client;

import com.tp.lab.model.utility.UniqueIDGenerator;

public final class Address {
    private final long ID;
    private final static UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private String country;
    private String city;
    private String street;
    private String homeNumber;


    public Address(final String country, final String city, final String street, final String homeNumber) {
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
