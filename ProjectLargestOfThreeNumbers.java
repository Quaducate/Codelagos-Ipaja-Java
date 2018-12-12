
package projectlargestofthreenumbers;
import java.util.Scanner;

public class ProjectLargestOfThreeNumbers 
{

    public static void main(String[] args) 
    {
        // Calling Scanner function
        Scanner input = new Scanner(System.in);
        
        //Declaring data types 
        double num1, num2, num3;
        
        //Prompt user for data to be inputed
        System.out.println("Enter first number: ");
        num1 = input.nextDouble();
        
        System.out.println("Enter second number: ");
        num2 = input.nextDouble();
        
        System.out.println("Enter third number: ");
        num3 = input.nextDouble();        
        
        //Compare numbers to determine the largest
        if (num1 > num2 & num1 > num3)
            System.out.println(num1 + " is the largest number.");
        
        else if (num2 > num1 & num2 > num3)
            System.out.println(num2 + " is the largest number.");
        
        else if (num3 > num1 & num3 > num2)
            System.out.println(num3 + " is the largest number.");
        
        else System.out.println("The numbers are not distinct.");
        
        
    }
    
}
