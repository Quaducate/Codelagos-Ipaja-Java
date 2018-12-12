/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ussd.code;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class UssdCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int code;
        code=input.nextInt();
        if (code!=144){
            System.out.println("NOT RECOG");
        }
        else{
            System.out.println("Initializing...");
            int count=0;
            while (count<5){
                count+=1;
                switch (count){
                    case 1:
                    System.out.println(count+ " - Airtime");
                    break;
                    case 2:
                    System.out.println(count+ " - Data");
                    break;
                    case 3:
                    System.out.println(count+ " - Extra Goddies");
                    break;
                    case 4:
                    System.out.println(count+ " - Data Enquiry");
                    break;
                    default:
                        System.out.println(count+ " - Exit");
                        break;
                        }
            }
            
        }
        int next;
        next=input.nextInt();
        if (next==1){
            int airtime=0;
            while (airtime<9){
                airtime+=1;
                switch (airtime){
                    case 1:
                        System.out.println(airtime+" - 100");
                        break;
                    case 2:
                        System.out.println(airtime+" - 200");
                        break;    
                    case 3:
                        System.out.println(airtime+" - 300");
                        break;
                    case 4:
                        System.out.println(airtime+" - 400");
                        break;
                    case 5:
                        System.out.println(airtime+" - 750");
                        break;    
                    case 6:
                        System.out.println(airtime+" - 1000");
                        break;
                    case 7:
                        System.out.println(airtime+" - 2000");
                        break;
                    case 8:
                        System.out.println(airtime+" - 5000");
                        break;  
                    default:
                        System.out.println(airtime+" - Exit");
                        break;    
                        
                }
            }
        }
        else if (next==2){
            int data=0;
            while (data<9){
                data+=1;
                switch (data){
                    case 1:
                        System.out.println(data+" - 10MB");
                        break;
                    case 2:
                        System.out.println(data+" - 20MB");
                        break;    
                    case 3:
                        System.out.println(data+" - 50MB");
                        break;    
                    case 4:
                        System.out.println(data+" - 100MB");
                        break;
                    case 5:
                        System.out.println(data+" - 200MB");
                        break; 
                    case 6:
                        System.out.println(data+" - 500MB");
                        break; 
                    case 7:
                        System.out.println(data+" - 1GB");
                        break;  
                    case 8:
                        System.out.println(data+" - 2MB");
                        break; 
                    default:
                        System.out.println(data+" - Exit");
                        break;    
                }
            }
        }
        else if (next==3){
            int Extragoddies=0;
            while (Extragoddies<2){
            Extragoddies+=1;
            switch (Extragoddies){
                case 1:
                        System.out.println(Extragoddies+" - Subscribe");
                        break;
                default:
                        System.out.println(Extragoddies+" - Exit");
                        break;        
            }
        }
        }
        else if (next==4){
            System.out.println("Request confirmed and details of data enquiry would be sent as SMS...");
        }
        else{
            System.exit(0);
        }
    }
    
}
