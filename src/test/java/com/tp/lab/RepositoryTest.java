package com.tp.lab;

import com.tp.lab.dal.Repository;
import com.tp.lab.model.Bill;
import com.tp.lab.model.Order;
import com.tp.lab.model.client.Address;
import com.tp.lab.model.client.Client;
import com.tp.lab.model.products.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest {
    Client client;
    Bill bill;
    Product product;
    int before_client_add, before_bill_add, before_product_add;

    @Before
    public void setUp() {
        client = new Client("a", "b", new Address("a", "b", "c", "d"));
        product = new Product("p", 2);
        List<Product> products = new ArrayList<Product>();
        products.add(product);
        Order order = new Order(products);
        bill = new Bill(client, order);
        before_client_add = Repository.getAllClients().size();
        before_bill_add = Repository.getAllBills().size();
        before_product_add = Repository.getAllProducts().size();
    }

    @Test
    public void addsProductsSuccessfully() {
        Repository.addProduct(product);
        Assert.assertEquals(Repository.getAllProducts().size(), before_product_add + 1);
    }

    @Test
    public void addsBillsSuccessfully() {
        Repository.addBill(bill);
        Assert.assertEquals(Repository.getAllBills().size(), before_bill_add + 1);
    }

    @Test
    public void addsClientsSuccessfully() {
        Repository.addClient(client);
        Assert.assertEquals(Repository.getAllClients().size(), before_client_add + 1);
    }
}
