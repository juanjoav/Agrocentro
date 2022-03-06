/*
 * Copyright (c) 5/3/2022.
 * Created by Juan Jose Ariza Velasco and Brayan Alfonso Collazos Ariza
 * All rights reserved
 */

import models.Billing;
import models.Client;
import models.DocumentType;
import models.Products.Product;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestBilling {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();
        Product product = new Product("jugo", 200, 4, LocalDate.of(2025,12,24),"perro");
        Product product1 = new Product("purina", 200, 4, LocalDate.of(2025,12,24),"perro");
        products.add(product);
        products.add(product1);

        Client client = new Client("Juan", "Ariza", DocumentType.CC, 1007451304);
        Billing billing = new Billing(client,"09-10-22",products, "C:/Users/juanj/OneDrive/Documentos/Semestre V/Requisitos/Agrocentro/src/imgs/logo-agrocentro.png");
//        Billing billng = new Billing("pepe","kk", "09-10-22", new String[]{"purina", "maiz", "arena"});
        billing.buildInvoice();
       // billng.buildInvoice();
    }
}
