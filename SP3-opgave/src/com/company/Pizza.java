package com.company;
//pizzaNumber;PizzaName;ingredients;price

public class Pizza{


    private String name;
    private String toppings;
    private int number;
    private int price;
    //boolean news;

    public Pizza(int number, String name, String toppings, int price) {
        this.name = name;
        this.toppings = toppings;
        this.number = number;
        this.price = price;
        //this.news = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return number + ";" + name + ";" + toppings + ";" + price;
    }
    //int totalOrder() {return getPrice();
}