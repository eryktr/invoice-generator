package com.tp.lab;

import com.tp.lab.model.Order;
import com.tp.lab.model.products.Product;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {

    Order order;

    protected void TotalPriceSetUp() {
        Product product1 = new Product("test",  10);
        Product product2 = new Product("test2", 20.5);
        Product product3 = new Product("T", 5);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        order = new Order(products);
    }

    @Test
    public void TotalPriceMatches() {
        TotalPriceSetUp();
        Assert.assertEquals(order.getTotalPrice(), 35.5, 0.001);
    }
}
