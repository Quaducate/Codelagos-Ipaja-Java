/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profit.loss;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProfitLoss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // TODO code application logic here
        Scanner input = new Scanner (System.in);
        //Calculate profit and loss
        System.out.println("Enter the value of income:");
        double income = input.nextDouble();
        System.out.println("Enter the value of expenses;");
        double expenses = input.nextDouble();
        System.out.println("Enter the value of tax;");
        double tax = input.nextDouble();
        double ProfitLoss = (income - expenses) - tax;
        System.out.println("The profit and loss statement:"+ ProfitLoss);
          // TODO code application logic here
    }
    
}
