package com.company;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Pizza> orders = new ArrayList<>();
    private String customerName, phoneNumber;
    private int price = 0;

    public Orders(String customerName, String phoneNumber) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
    }
}
