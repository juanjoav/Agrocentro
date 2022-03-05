/*
 * Copyright (c) 4/3/2022.
 * Created by Juan Jose Ariza Velasco and Brayan Alfonso Collazos Ariza
 * All rights reserved
 */

package models.Products;

import java.time.LocalDate;

public class Product implements Comparable<Product>{

    private String name;
    private double price;
    private int stock;
    private LocalDate expirationDate;
    private String productType;

    public Product(String name, double price, int stock, LocalDate expirationDate, String productType) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.expirationDate = expirationDate;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public int compareTo(Product product) {
        return product.getName().compareToIgnoreCase(this.name);
    }
}
