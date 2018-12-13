/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Code is written by Olajide Otolorin
// 08163195921

package accounttest;

import java.util.Scanner;


/**
 * 
 * @author authorlauren
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("    otomighty@gmail.com\n    08163195921\n    "
                + "Olajide Otolorin");
        
        Account account1 = new Account(40.00);
        Account account2 = new Account(-10.00);
        
        
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
        
        
        Scanner input = new Scanner(System.in);
        
        double depositAmount;
        System.out.print( "Enter deposit amount for account1: ");
        depositAmount = input.nextDouble();
        System.out.printf( "\nadding %.2f to accout1 balance\n\n", depositAmount );
        account1.credit(depositAmount);
        
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
        
        System.out.print( "Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf( "\nadding %.2f to accout2 balance\n\n", depositAmount );
        account2.credit(depositAmount);
        
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
    }
    
}
