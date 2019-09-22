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
public class CreditAccount extends BankAccount {
    
    public CreditAccount(String firstname, String lastname, long accountNumber, double balance, int transactionLimit, int withdrawLimit) {
        super(firstname, lastname, accountNumber, balance, transactionLimit, withdrawLimit);
    }
}
