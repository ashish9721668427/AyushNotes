package com.codewithashishsample.ayushnotes;

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

        ba.withdraw(25500);
        ba.getBalances();
        ba.withdraw(544222);

        System.out.println(ba.getBalances());
    }
}

class BankAccount {
    private double balances;

    public void deposit(int amount){
        balances += amount;
    }

    public void withdraw(int amount){
        balances -= amount;
    }

    public double getBalances(){
        return balances;
    }
}