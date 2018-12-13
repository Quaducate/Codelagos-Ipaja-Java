
/*This is a project that displays the largest of three numbers after 
  the user inputs intergral variables with the keyboard
*/
package largestofthreenumbers;

//Importing the Scanner utility 
import java.util.Scanner;

public class Largestofthreenumbers 
{


    public static void main(String[] args) 
    {
        //Requesting the scanner function
        Scanner input = new Scanner(System.in);
        
        //Declare the anonymous variables as a double variable data type
        double n1, n2, n3;
        
        //Allow user input first random number of any size
        System.out.println("Enter first number: ");
        n1 = input.nextDouble();
        
        //Allow user input second random number of any size
        System.out.println("Enter second number: ");
        n2 = input.nextDouble();
        
        //Allow user input third random number of any size
        System.out.println("Enter third number: ");
        n3 = input.nextDouble();
        
        /*Computation that compares the values of the variables inputed by the
          user
        */
        
        if (n1 > n2 & n1 > n3)
            System.out.println(n1 + " is the largest number.");
        
        else if (n2 > n1 & n2 > n3)
            System.out.println(n2 + " is the largest number.");
        
        else if (n3 > n2 & n3 > n1)
            System.out.println(n3 + " is the largest number.");
        
        else System.out.println("The numbers are not distinct.");
        
        //Details of the Author of the program are displayed below output of the program
        System.out.println("Name: BECKLEY Moses Oluwadamilola");
        System.out.println("Email: damibeckley@gmail.com");
        System.out.println("Phone Number: 07030325335");
    }
    
}
