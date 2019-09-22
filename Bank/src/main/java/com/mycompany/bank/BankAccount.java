/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;

/**
 *
 * @author marlon
 */
public abstract class BankAccount {
    
    private final long accountNumber;
    private final String firstname;
    private final String lastname;
    private double balance;
    private final int transactionLimit;
    private int withdrawLimit;
    
    public BankAccount(String firstname, String lastname, long accountNumber, double balance, int transactionLimit, int withdrawLimit) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionLimit = transactionLimit;
        this.withdrawLimit = withdrawLimit;
    }
    
    public double withdraw(double amount) throws Exception {
        
        if(amount > transactionLimit) {
            throw new Exception();
        } else if(withdrawLimit - amount < 0) {
            throw new Exception();
        } else {
            balance -= amount;
            withdrawLimit -= amount;
        }
        
        return balance;
    }
    
    public double deposit(double amount) {
       
        balance += amount;
        return balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getFullName() {
        return firstname + " " + lastname;
    }
}
