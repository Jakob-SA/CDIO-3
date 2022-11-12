package org.example;

public class Account {


    public int balance;

    public Account() {}
    public int getBalance(){
        return balance;
    }
    public void addBalance(int amount){
        balance += amount;
    }
    public void payRent(Account player){
        this.balance -= balance;
        player.balance +=balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString(){
        return balance + " M";
    }
}