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
public class Bank {
    public static void main(String ...args) throws Exception {
        
        CreditAccount one = new CreditAccount("Marlon", "Demas", 123456789, 1000, 2500, 800);
        
        DebitAccount two = new DebitAccount("Marlon", "Demas", 123456789, 600, 2500, 800);
    }
}
