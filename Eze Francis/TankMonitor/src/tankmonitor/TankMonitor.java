/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankmonitor;
import java.util.Scanner;

/**
 *
 * @author FhrancoLaSurge
 */
public class TankMonitor {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("EZE FRANCIS");
        System.out.println("FHRANCOREY99@GMAIL>COM");
      Scanner input= new Scanner(System.in);
       System.out.print("Enter v : ");
       int v =input.nextInt();
 if( v == 20000){
 System.out.println("Normal Level");
    }

if (v== 15000){
System.out.println("Normal Level");}

if(v==12500){
System.out.println("Normal Level");}
if (v< 12500){
System.out.println("Low Level");}
    

}
    
}
