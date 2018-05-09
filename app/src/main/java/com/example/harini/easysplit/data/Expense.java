package com.example.harini.easysplit.data;

import java.util.List;

class Expense {

    private User buyer;
    private String expenseName;
    private List<User> membersToPay;
    private double price;

    public Expense(User buyer, String expenseName, List<User> membersToPay, double price) {
        this.buyer = buyer;
        this.expenseName = expenseName;
        this.membersToPay = membersToPay;
        this.price = price;


    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public List<User> getMembersToPay() {
        return membersToPay;
    }

    public void setMembersToPay(List<User> membersToPay) {
        this.membersToPay = membersToPay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
