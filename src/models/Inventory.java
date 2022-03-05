/*
 * Copyright (c) 19/2/2022.
 * Created by Juan Jose Ariza Velasco and Brayan Alfonso Collazos Ariza
 * All rights reserved
 */

package models;

import models.Products.Product;

import java.util.*;

public class Inventory {

    private ArrayList<Product> productList;

    public Inventory() {
        productList = new ArrayList<Product>();
    }

    private boolean isEmpty() {
        return productList.isEmpty();
    }

    public boolean isRegister(Product product) {
        if (!isEmpty()) {
            for (Product p : productList) {
                if ((p.getName().equalsIgnoreCase(product.getName())) && p.getProductType().equalsIgnoreCase(product.getProductType())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addProduct(Product product) {
        if(isRegister(product)) {
            for (Product p : productList) {
                if ((p.getName().equalsIgnoreCase(product.getName())) && p.getProductType().equalsIgnoreCase(product.getProductType())) {
                    p.setStock(p.getStock() + product.getStock());
                }
            }
        } else {
            productList.add(product);
        }
    }

    public void removeProduct(Product product) {
        if (isRegister(product)){
            productList.remove(product);
        }
    }

    public ArrayList<Product> getProductList() {
        return this.productList;
    }
}
