package com.tp.lab.DAL;

import com.tp.lab.Model.Bill;
import com.tp.lab.Model.Client;


import java.util.ArrayList;

public final class Repository {
    private Repository() {}

    private static ArrayList<Bill> bills;
    private static ArrayList<Client> clients;

    public static ArrayList<Bill> getBills() {
        return bills;
    }

    public static ArrayList<Client> getClients() {
        return clients;
    }

    public static void addClient(Client c) {
        clients.add(c);
    }

    public static  void addBill(Bill b) {
        bills.add(b);
    }

}
