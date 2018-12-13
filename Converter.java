package Converter;

import java.util.Scanner;

public class Converter {

  public static void main(String[] args) {
  
     
  Scanner input = new Scanner(System.in);
  double value1 = 0.00;
  double value2 = 0.00;
  String Currency;
  String name;
  int age;
  
  // Ask user for name
  System.out.print("Enter your name: ");
  name = input.nextLine();
  
  // Ask for user age
  System.out.print("Enter your age: ");
  age = input.nextInt();
  
  // Declaration
  if (age<20){
    System.out.println("You are too Young to check for that...Goodbye");
    System.exit(0);
  }else {
    System.out.println("You are eligible to view");
  } 
  // Welcome user
  System.out.println("Hello " + (name) + " Welcome to mobile converter that allows you to convert between Nigeria Naira and US Dollar");
  
  // Ask user to enter amount
  System.out.print("Enter amount to convert: ");
  value1 = input.nextDouble();
  
  // Ask for currency to convert
  System.out.print("USD or Naira: ");
  Currency = input.next();
  
  // Calculate for output
  if (Currency.equals("USD")){
    value2 = value1 * 364.69;
    System.out.println(value1 + "USD = " + value2 + "Naira.(Conversion rate: 1 USD = 364.69 Naira)");
  }else if (Currency.equals("Naira")){
    value2 = value1 * 0.0027;
    System.out.println(value1 + "Naira = " + value2 + "USD.(Conversion rate: 1 Naira = 0.0027 USD)");
  }else {
    System.out.println("Conversion rate: 1 USD = 364.69 Naira" + "\nConversion rate: 1 Naira = 0.0027 USD");  
  }
  input.close();
}
   
  }