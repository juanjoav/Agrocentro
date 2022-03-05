/*
 * Copyright (c) 4/3/2022.
 * Created by Juan Jose Ariza Velasco and Brayan Alfonso Collazos Ariza
 * All rights reserved
 */

import models.Inventory;
import models.Products.Product;

import java.time.LocalDate;
import java.util.*;

public class TestInventory {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product product = new Product("jugo", 200, 4, LocalDate.of(2025,12,24),"perro");
        Product product1 = new Product("purina", 200, 4, LocalDate.of(2025,12,24),"perro");
        Product product2 = new Product("jugo", 200, 4, LocalDate.of(2025,12,24),"gato");
        Product product3 = new Product("jugo", 200, 4, LocalDate.of(2025,12,24),"perro");

        inventory.addProduct(product);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        ArrayList<Product> productList = inventory.getProductList();

        for (Product p : productList) {
            System.out.println(p.getName() + " " + p.getProductType() + " --> " + p.getStock());
        }

    }
}
