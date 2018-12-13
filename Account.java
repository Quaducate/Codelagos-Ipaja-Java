/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Code is written by Olajide Otolorin
// 08163195921

package accounttest;



/**
 *
 * @author authorlauren
 */
public class Account {
    
    private double balance;
    
    public Account( double initialBalance )
            
    {
    
    if( initialBalance > 0.0)
        balance = initialBalance;
    }       
    
    
    public void credit(double amount){
    
    balance = balance + amount;
    }
    
    public double getBalance(){
    
        return balance;
    }
}
