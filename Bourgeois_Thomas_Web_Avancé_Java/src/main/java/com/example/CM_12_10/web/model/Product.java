package com.example.CM_12_10.web.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String designation;
    private double prix;

    public Product(int code, String designation, double prix) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
    }

    public Product() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "code=" + code +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }
}