package calci;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("*****CALCULATOR******");
		System.out.println("Enter the Number a: ");
		int a=s.nextInt();
		System.out.println("Enter the Number b: ");
		int b=s.nextInt();
		System.out.println("Enter operator: ");
		Addition add=new Addition();
		System.out.println("1. Addition");
		Subtraction sub=new Subtraction();
		System.out.println("2. Subtract Second number from first number.");
		Multiplication mul=new Multiplication();
		System.out.println("3. Multiplication");
		Divison div=new Divison();
		System.out.println("4. Divide First number with second number.");
		int k=s.nextInt();
		int value;
		if(k==1)
		{
			value=add.cal(a,b);
			System.out.println("Sum of first number and second number is: "+value);
		}
		else if(k==2)
		{
			value=sub.cal(a,b);
			System.out.println("Difference between first number and second number is: "+value);
		}
			
		else if(k==3)
		{
			value=mul.cal(a,b);
			System.out.println("product of first number and second number is: "+value);
		}
		else if(k==4)
		{
			value=div.cal(a,b);
			System.out.println("Quotient when first number is divided by second number is: "+value);
		}
		s.close();
	}
	}


