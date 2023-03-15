package CalculatorPackage;

import java.util.Scanner;

public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter Two Numbers which you would like to perform operation");
	   System.out.println("Enter the number Operation");
	   int a = scan.nextInt();
	   int b = scan.nextInt();
	   int ch= scan.nextInt();
       Calculator cal = new Calculator();
       if(ch==1)
       {
    	   result= cal.add(a, b);
    	   System.out.println("Addition Result : "+ result);
       }
       else if(ch==2)
       {
    	   result= cal.Sub(a, b);
    	   System.out.println("subtraction Result : "+ result);
       }
       else if (ch==3)
       {
    	   result= cal.Multiply(a, b);
    	   System.out.println("subtraction Result : "+ result);
       }
       else if (ch==4)
       {
    	   result= cal.Div(a, b);
    	   System.out.println("subtraction Result : "+ result);
       }
       
       
       
	}

}
