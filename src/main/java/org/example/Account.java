package org.example;

public class Account {


    private int balance;

    public Account() {}
    public int getBalance(){
        return balance;
    }
    public void addBalance(int amount){
        balance += amount;
    }
    public void payRent(Account player, int amount){
        this.balance -= amount;
        player.balance +=amount;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString(){
        return balance + " M";
    }
}