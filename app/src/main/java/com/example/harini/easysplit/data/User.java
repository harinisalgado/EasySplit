package com.example.harini.easysplit.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class User {

    private String uid;
    private String displayName;
    private List<Group> userGroups;
    private List<User> friends;

    private HashMap<User, Double> moneyToPay;
    private HashMap<User, Double> moneyToReceive;

    public User(String uid, String displayName) {
        this.uid = uid;
        this.displayName = displayName;
        userGroups = new ArrayList<Group>();
        friends = new ArrayList<User>();
        moneyToPay = new HashMap<User, Double>();
        moneyToReceive = new HashMap<User, Double>();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<Group> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(List<Group> userGroups) {
        this.userGroups = userGroups;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public HashMap<User, Double> getMoneyToPay() {
        return moneyToPay;
    }

    public void setMoneyToPay(HashMap<User, Double> moneyToPay) {
        this.moneyToPay = moneyToPay;
    }

    public HashMap<User, Double> getMoneyToReceive() {
        return moneyToReceive;
    }

    public void setMoneyToReceive(HashMap<User, Double> moneyToReceive) {
        this.moneyToReceive = moneyToReceive;
    }

    public double getTotalToPay() {
        Collection<Double> values = moneyToPay.values();
        double total = 0;
        for (Double value : values) {
            total += value;
        }
        return total;
    }

    public double getTotalToReceive() {
        Collection<Double> values = moneyToReceive.values();
        double total = 0;
        for (Double value: values){
            total+=value;
        }
        return total;
    }


}
