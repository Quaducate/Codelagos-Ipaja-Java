/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculating.the.radius.of.a.sector;

import java.util.Scanner;

/**
 *
 * @author Assistant
 */
public class CalculatingTheRadiusOfASector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Create an instance of the Scanner class
        Scanner input = new Scanner(System.in);
//Ask the user to enter the value of arc length
System.out.print("Enter arc length:");
double arclength=input.nextDouble();
//Ask the user to enter the value of the angle
System.out.print("Enter angle:");
double angle = input.nextDouble();
//Compute radius
double radius = (arclength* 180)/ (angle* 3.14);
//Print out the radius
System.out.println("Radius = " + radius);
    }
} 
    
