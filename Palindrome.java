/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String original, reverse="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string/number to checkif it is a palindrome");
        original=in.nextLine();
        int length=original.length();
        for (int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
        if(original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number is not a palindrome.");
    }
    
}
