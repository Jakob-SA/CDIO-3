package org.example;

public class Account extends Player {
    public int balance;

    public Account(int inbalance) {
        super("title");
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