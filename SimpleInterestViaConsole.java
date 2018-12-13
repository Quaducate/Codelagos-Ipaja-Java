/*Developed by Nwosu Ikechukwu Remmy 08038165081 lalasky4jesus@gmail.com
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinterestviaconsole;
import java.util.Scanner;
/**
 *
 * @author station8
 */
public class SimpleInterestViaConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("Developed by Nwosu Ikechukwu Remmy 08038165081 lalasky4jesus@gmail.com");
Scanner input=new Scanner(System.in);
System.out.print("Enter p:");
double p=input.nextDouble();
System.out.print("Enter r:");
double r=input.nextDouble();
System.out.print("Enter t:");
double t=input.nextDouble();
double i=(p*r*t)/100;
System.out.print("The Simple interest is " + i + "\n");
    }
    
}
