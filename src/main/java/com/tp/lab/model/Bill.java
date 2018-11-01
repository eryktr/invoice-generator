package com.tp.lab.model;

import com.tp.lab.model.client.Client;
import com.tp.lab.model.utility.UniqueIDGenerator;


public final class Bill implements Printable {
    private final long ID;
    private final static UniqueIDGenerator idGenerator = new UniqueIDGenerator();
    private final Client client;
    private final Order order;
    private boolean isPaid;


    public Bill(final Client client, final Order order) {
        this.ID = idGenerator.getUniqueId();
        this.client = client;
        this.order = order;
        this.isPaid = false;
    }

    public long getID() {
        return ID;
    }

    public Client getClient() {
        return client;
    }

    public void deactivate() {
        isPaid = true;
    }

    public boolean isActive() {
        return !isPaid;
    }

    @Override
    public void print(final PrintMode mode) {
        System.out.println("Bill id: "+ID);
        order.print(PrintMode.Simple);
        client.print(PrintMode.Simple);
        if(mode == PrintMode.Detailed) {
            System.out.println("Is paid: " + isPaid);
        }
    }
}
