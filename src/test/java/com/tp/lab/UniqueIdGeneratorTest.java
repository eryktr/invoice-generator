package com.tp.lab;

import com.tp.lab.model.products.Product;
import org.junit.Assert;
import org.junit.Test;

public class UniqueIdGeneratorTest {
    @Test
    public void IdsAreAscending() {
        Product product = new Product("a", 20);
        Product product2 = new Product("b", 30);
        Assert.assertTrue(product2.getID() > product.getID());
    }

}
