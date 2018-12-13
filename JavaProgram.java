/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;

import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class JavaProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, i, tab;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        num = scan.nextInt();
        
        System.out.print("Table of " + num + " is\n");
        for(i=1; i<=10; i++) {
            tab = num*i;
            System.out.print(num + " * " + i + " = " + tab + "\n");
        }
    }
    
}
