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
public class LimitException extends Exception{
    
    public LimitException(String message) {
        super(message);
    }
}
