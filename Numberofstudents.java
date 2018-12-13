/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberofstudents;
import java.util.Scanner;

/**
 *
 * @author GiFtEdHaNdS
 */
public class Numberofstudents {
    int JSS1Students;
        int JSS2Students;
        int JSS3Students;
        int SS1Students;
        int SS2Students;
        int SS3Students;
        
public Numberofstudents(int JSS1Students, int JSS2Students, int JSS3Students,
        int SS1Students, int SS2Students, int SS3Students){
    this.JSS1Students = JSS1Students;
    this.JSS2Students = JSS2Students;
    this.JSS2Students = JSS3Students;
    this.SS1Students = SS1Students;
    this.SS2Students = SS2Students;
    this.SS3Students = SS3Students;
}        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Tessy Aigbogun");
        System.out.println("tessy.aigbogun@yahoo.com");
        Scanner input = new Scanner(System.in);
        System.out.print("JSS1Students number: ");
        int JSS1Students = input.nextInt();
        
        System.out.print("JSS2Students number: ");
        int JSS2Students = input.nextInt();
        
        System.out.print("JSS3Students number: ");
        int JSS3Students = input.nextInt();
        
        
        System.out.print("SS1Students number: ");
        int SS1Students = input.nextInt();
        
        System.out.print("SS2Students number: ");
        int SS2Students = input.nextInt();
        
        
        System.out.print("SS3Students number: ");
        int SS3Students = input.nextInt();         

        System.out.print(JSS1Students + JSS2Students +JSS3Students +SS1Students +SS2Students + SS3Students + "Total:") ;
        
        
        
        
        Numberofstudents numberofstudents = new Numberofstudents(JSS1Students,
        JSS2Students, JSS3Students, SS1Students, SS2Students, SS3Students);
        
        
        
        
        
        
        
        
        
        
    }
    
}
