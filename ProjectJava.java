/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.java;

/**
 *
 * @author station8
 */
import java.util.Scanner;
public class ProjectJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Score :");
        int age=in.nextInt();
        if (age<2)
        {System.out.println("You are an Infant.");
        }
        else if (age<12){
            System.out.println("You are a Child.");
        }
        else if (age<20){
            System.out.println("You are a Teenager.");
        }
        else if (age<65){
            System.out.println("You are an Adult.");}
        else{
            System.out.println("You are a Senior Citizen.  ");
        }
        
                
        
    }
    
}