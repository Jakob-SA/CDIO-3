package org.example;

public class Account {
    private int balance;

    public Account(int inbalance) {
        balance = inbalance;
    }
    public int getBalance(){
        return balance;
    }
    public void addBalance(int amount){
        balance += amount;
    }

    public String toString(){
        return balance + "M";
    }
}