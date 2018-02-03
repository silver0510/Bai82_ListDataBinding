package com.example.sinki.model;

/**
 * Created by Sinki on 9/16/2017.
 */

public class Contact {
    private String phone;
    private String name;

    public Contact(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public Contact() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
