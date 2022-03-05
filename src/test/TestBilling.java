/*
 * Copyright (c) 5/3/2022.
 * Created by Juan Jose Ariza Velasco and Brayan Alfonso Collazos Ariza
 * All rights reserved
 */

import models.Billing;

public class TestBilling {

    public static void main(String[] args) {
        Billing billing = new Billing("juan","ariza", "09-10-22");
        billing.buildInvoice();
    }
}
