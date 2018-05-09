package com.example.harini.easysplit.data;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<User> groupMembers;
    private List<Expense> expenses;

    public Group(User creator){
        groupMembers = new ArrayList<User>();
        groupMembers.add(creator);
        expenses = new ArrayList<Expense>();
    }

    public List<User> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<User> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public void addExpense(Expense toAdd){
//        expenses.add(toAdd);
//        toAdd.getBuyer().addItemBought(toAdd);
//        List<User> membersToPay = toAdd.getMembersToPay();
//        double split = Math.ceil(toAdd.getPrice() / membersToPay.size()*100)/100;
//        for (int i = 0; i < membersToPay.size() ; i++) {
//            membersToPay.get(i).addToMoneyPaid
//        }
    }
}
