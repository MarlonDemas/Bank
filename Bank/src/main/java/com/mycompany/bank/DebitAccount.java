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
public class DebitAccount extends BankAccount{
    
    public DebitAccount(String firstname, String lastname, long accountNumber, double balance, int transactionLimit, int withdrawLimit) {
        super(firstname, lastname, accountNumber, balance, transactionLimit, withdrawLimit);
    }
    
    @Override
    public double withdraw(double amount) throws Exception {
        
        if(getBalance() - amount < 0) {
            throw new LimitException("Issufficient amount withdrawn. Amount exceeded current balance availible.");
        }
        
        return super.withdraw(amount);
    }
}
