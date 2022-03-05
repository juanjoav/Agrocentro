/*
 * Copyright (c) 19/2/2022.
 * Created by Juan Jose Ariza Velasco and Brayan Alfonso Collazos Ariza
 * All rights reserved
 */

package models;

public class Administrator extends Person{

    private String adminUser = "ADMIN";
    private String adminPassword = "ADMIN";
    private boolean status;

    public Administrator(String name, String lastName, DocumentType documentType, double documentNumber) {
        super(name, lastName, documentType, documentNumber);
    }

    public Administrator() {
        super();
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public boolean isStatus(String admin, String adminPassword) {
        return this.adminUser.equals(admin) && this.adminPassword.equals(adminPassword);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
