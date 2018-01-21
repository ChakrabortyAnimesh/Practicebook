package com.company;

public class Account {
     private String ownerName;
     private double balance;
    public Account(){
        balance=0.0;

    }
    public void setAccountOwnerName(String name){
        ownerName=name;
    }
    public String getAccountOwnerName(){
        return ownerName;
    }
    public void setInitialBalance(double bal){
     balance=bal;
    }
    public void add(double amt){
        balance +=amt;
    }
    public void deduct(double amt){
        balance-=amt;
    }
    public double getcurrentBalance(){
        return balance;
    }
}
