/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input.pkg10.numbers.and.print.sum;

/**
 *
 * @author Patrick Nwagbara
 */
import java.util.Scanner;
public class Input10NumbersAndPrintSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Good day, you are about to calculate the sum of ten numbers, kindly input the numbers");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i += 1){
            sum += input.nextInt();
        }
        System.out.println("The total sum is: " + sum );
        }
    }
    
