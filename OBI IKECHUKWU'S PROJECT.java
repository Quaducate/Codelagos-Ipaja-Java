/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulas.calculator;
import java.util.*;
/**
 *
 * @author USER
 */
public class FormulasCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String instruction;
        System.out.println("Make sure the first letter of your input is in uppercase");
        System.out.println("Type in the problem you want to solve. For example: Perimeter of a square,...");
        System.out.println("Area of a rectangle, Quadratic equation, etc");
        String formulas;
        formulas=input.nextLine();
        if ("Quadratic equation".equals(formulas)){
      double a;
      System.out.println("Enter value for a");
      a=input.nextDouble();
      double b;
      System.out.println("Enter value for b");
      b=input.nextDouble();
      double c;
      System.out.println("Enter value for c");
      c=input.nextDouble();
      double form = Math.pow(b, 2)-(4*a*c);
      if(form>0){
          System.out.println("two real roots");
      }
      else if(form==0){
       System.out.println("one root");
      }
      else{
          System.out.println("no root");
      }
      double x1;
      x1=(-b+(Math.sqrt(form)))/(2*a);
      double x2;
      x2=(-b-(Math.sqrt(form)))/(2*a);
      System.out.println("x1=" + x1);
      System.out.println("x2=" + x2);
        }
        else if ("Area of circle".equals(formulas)){
      int radius;
      System.out.println("what is the radius");
      radius=input.nextInt();
      float π;
      π=(float) 3.142;
       float area;
      area=(π*radius*radius);
      System.out.println("area= " + area);
    }
        else if ("Area of square".equals(formulas)){ 
       int length;
       System.out.println("Enter the length ");
       length=input.nextInt();
       float area;
       area=(float) (Math.pow(length, 2));
       System.out.println("Area= " + area);
        }
        else if ("Area of rectangle".equals(formulas)){
      int length;
      System.out.println("what is the length");
      length=input.nextInt();
      int breadth;
      System.out.println("what is the breadth");
      breadth=input.nextInt();
      int area;
      area=length*breadth;
      System.out.println("Area= "+area);
        }
        else if ("Area of trapezium".equals(formulas)){
      int a;
      System.out.println("what is the a");
      a=input.nextInt();
      int b;
      System.out.println("what is the b");
      b=input.nextInt();
      int h;
      System.out.println("what is the h");
      h=input.nextInt();
      int area;
      area=(int) (0.5*(a+b)*h);
      System.out.println("Area= "+area);
        } 
        else if ("Area of triangle".equals(formulas)){
      int base;
      System.out.println("what is the base");
      base=input.nextInt();
      int height;
      System.out.println("what is the height");
      height=input.nextInt();
      float area;
      area=(float) (0.5*base*height);
      System.out.println("Area= "+area);
        }
        else if ("Area of parallelogram".equals(formulas)){
      int base;
      System.out.println("what is the base");
      base=input.nextInt();
      int height;
      System.out.println("what is the height");
      height=input.nextInt();
      int area;
      area= (base*height);
      System.out.println("Area= "+area);
        }
        else if ("Surface area of cube".equals(formulas)){
      int length;
      System.out.println("what is the length of side");
      length=input.nextInt();
      float area;
      area=(float) (6*(Math.pow(length,2)));
      System.out.println("Surface Area= "+area);
        }
        else if ("Surface area of cylinder".equals(formulas)){
      int radius;
      System.out.println("what is the radius");
      radius=input.nextInt();
      int heigth;
      System.out.println("what is the heigth");
      heigth=input.nextInt();
      float π;
      π=(float) 3.142;
      float area;
      area=(float) ((2*π*(Math.pow(radius, 2))+(2*π*radius*heigth)));
      System.out.println("Surface Area= "+area);
                }
        else if ("Surface area of rectangular prism".equals(formulas)){
      int length;
      System.out.println("what is the length");
      length=input.nextInt();
      int width;
      System.out.println("what is the width");
      width=input.nextInt();
      int heigth;
      System.out.println("what is the heigth");
      heigth=input.nextInt();
      float area;
      area=(2*(length*width)+(length*heigth)+(width*heigth));
      System.out.println("Surface Area= "+area);
    }
      else if ("Surface area of sphere".equals(formulas)){
      int radius;
      System.out.println("what is the radius");
      radius=input.nextInt();
      float π;
      π=(float) 3.142;
      float area;
      area=(float) ((4*π*(Math.pow(radius, 2))));
      System.out.println("Surface Area= "+area);  
    }
        else if ("Surface area of circular cone".equals(formulas)){
      int radius;
      System.out.println("what is the radius");
      radius=input.nextInt();
      int heigth;
      System.out.println("what is the heigth");
      heigth=input.nextInt();
      float π;
      π=(float) 3.142;
      float area;
      area=(float) ((π*(Math.pow(radius, 2))+(π*radius*(Math.sqrt((Math.pow(heigth, 2))+((Math.pow(radius, 2))))))));
      System.out.println("Surface Area= "+area);
    }
        else if ("Surface area of square pyramid".equals(formulas)){
      int length;
      System.out.println("what is the length");
      length=input.nextInt();
      int slant_heigth;
      System.out.println("what is the slant heigth");
      slant_heigth=input.nextInt();
      float area;
      area=(float)((Math.pow(length,2))+(2*length*slant_heigth));
      System.out.println("Surface Area= "+area);
        }
        else if ("Volume of cylinder".equals(formulas)){
      int radius;
      System.out.println("what is the radius");
      radius=input.nextInt();
      int heigth;
      System.out.println("what is the heigth");
      heigth=input.nextInt();
      float π;
      π=(float) 3.142;
      float volume;
      volume=(float) (π*(Math.pow(radius, 2))*heigth);
      System.out.println("Volume= "+volume);
    }
        else if ("Volume of cone".equals(formulas)){
      int radius;
      System.out.println("what is the radius");
      radius=input.nextInt();
      int heigth;
      System.out.println("what is the heigth");
      heigth=input.nextInt();
      float π;
      π=(float) 3.142;
      float volume;
      volume=(float) ((1/3)*(π*(Math.pow(radius, 2))*heigth));
      System.out.println("Volume= "+volume);
        }
        else if ("Volume of cube".equals(formulas)){
      int side;
      System.out.println("what is the length of side");
      side=input.nextInt();
      float volume;
      volume=(float) (Math.pow(side,3));
      System.out.println("Volume= "+volume);
        }
        else if ("Volume of cuboid".equals(formulas)){
      int length;
      System.out.println("what is the length");
      length=input.nextInt();
      int breadth;
      System.out.println("what is the breadth");
      breadth=input.nextInt();
      int heigth;
      System.out.println("what is the heigth");
      heigth=input.nextInt();
      int volume;
      volume=length*breadth*heigth;
      System.out.println("Volume= "+volume);
        }
      else if ("Volume of pyramid".equals(formulas)){
      int base;
      System.out.println("what is the base");
      base=input.nextInt(); 
      int heigth;
      System.out.println("what is the heigth");
      heigth=input.nextInt();
      float volume;
      volume=((1/3)*(base*heigth));
      System.out.println("Volume= "+volume);
      }
        else if ("Volume of sphere".equals(formulas)){
      int radius;
      System.out.println("what is the radius");
      radius=input.nextInt(); 
      float π;
      π=(float) 3.142;
      float volume;
      volume=(float)((4/3)*(π*(Math.pow(radius,3))));
      System.out.println("Volume= "+volume);
      }
        else if ("Volume of ellipsoid".equals(formulas)){
      int r1;
      System.out.println("what is the r1");
      r1=input.nextInt();
      int r2;
      System.out.println("what is the r2");
      r2=input.nextInt();
      int r3;
      System.out.println("what is the r3");
      r3=input.nextInt();
      float π;
      π=(float) 3.142;
      float volume;
      volume=((4/3)*(π*r1*r2*r3));
      System.out.println("Volume= "+volume);
      }
        else if ("Perimeter of rectangle".equals(formulas)){
      int length;
      System.out.println("what is the length");
      length=input.nextInt();
      int breadth;
      System.out.println("what is the breadth");
      breadth=input.nextInt();
      int perimeter;
      perimeter=(2*(length+breadth));
      System.out.println("perimeter= "+perimeter);
        }
        else if ("Perimeter of square".equals(formulas)){
      int length;
      System.out.println("what is the length");
      length=input.nextInt();
      int perimeter;
      perimeter=(4*length);
      System.out.println("perimeter= "+perimeter);
        }
}
  
}
    

