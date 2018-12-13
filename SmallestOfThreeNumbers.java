/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallest.of.three.numbers;
import java.util.Scanner;
/**
 *
 * @author Damilola
 */
public class SmallestOfThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare data types
    Scanner input = new Scanner(System.in);
    double numb1, numb2, numb3;
    
    //Prompt user to input data
    System.out.println("Enter first number: ");
    numb1 = input.nextDouble();
    
    System.out.println("Enter second number: ");
    numb2 = input.nextDouble();
    
    System.out.println("Enter third number: ");
    numb3 = input.nextDouble();
  
    //Compare the numbers to determine the smallest
    if (numb1 < numb2 & numb1 < numb3)
        System.out.println(numb1 + "is the smallest number.");
    
    else if (numb2 < numb1 & numb2 < numb3)
        System.out.println(numb2 + "is the smallest number.");
    
    else if (numb3 < numb1 & numb3 < numb2)
        System.out.println(numb3 + "is the smallest number.");
        
    else
        System.out.println("The numbers are not distinct from one another.");
    
 
    }
    
            
    
}
