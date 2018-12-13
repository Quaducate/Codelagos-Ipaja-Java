/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minilottery;

import java.util.Scanner;

/**Developed by Seyi Adedeji, 08035624874
 *
 * @author station8
 */
public class MiniLottery {

    /**
     * @param args the command line arguments
     */
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Welcome to Seyi's Lottery show");
        int winNum = (int)Math.random();
        
        System.out.print("Try your luck for the winning number: ");
        String userEnt =  input.next();
        int change = Integer.parseInt(userEnt);
        
        if (winNum == change) {
            System.out.println("Congratulations! You have found the lucky number!");
        } else{
            System.out.println("Sorry! Try again");
        }
        
    }
    
}
