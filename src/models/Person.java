/*
 * Copyright (c) 4/3/2022.
 * Created by Juan Jose Ariza Velasco and Brayan Alfonso Collazos Ariza
 * All rights reserved
 */

package models;

public class Person {

    private String name;
    private String lastName;
    private DocumentType documentType;
    private double documentNumber;

    public Person(String name, String lastName, DocumentType documentType, double documentNumber) {
        this.name = name;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public double getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(double documentNumber) {
        this.documentNumber = documentNumber;
    }
}
