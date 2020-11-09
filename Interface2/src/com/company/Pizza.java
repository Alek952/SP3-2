package com.company;
//pizzaNumber;PizzaName;ingredients;price

public class Pizza{
    String name;
    String toppings;
    String number;
    String price;
    boolean news;

    public Pizza(String number, String name, String toppings, String price) {
        this.name = name;
        this.toppings = toppings;
        this.number = number;
        this.price = price;
        this.news = true;

    }

    public String getName() {
        return name;
    }


    public String getNumber() {
        return number;
    }

    public String getPrice() {
        return price;
    }

    //int totalOrder() {return getPrice();
    }

