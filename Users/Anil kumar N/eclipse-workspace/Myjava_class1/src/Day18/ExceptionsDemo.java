package Day18;

import java.util.Scanner;

public class ExceptionsDemo {
public static void main(String[] args) {
	//Example 1
	
	System.out.println("Program is started");
	Scanner sc=new Scanner (System.in);
	/*
	System.out.println("Enter a number :");
	int num=sc.nextInt();
	System.out.println(100/num);  //ArthmeticException
	
	
	
	
	System.out.println("Program is Completed");
	System.out.println("Program is exited..");
	
	
	// Example 02
	int a[]=new int[5];
	System.out.println("Enter the position(0-4) :");
	int pos=sc.nextInt();
	
	
	System.out.println("Enter a value :");
	int value=sc.nextInt();
	
	a[pos]=value;
	
	
	//Ex 03
		String s="welcome"; // We should have numbers else will get NumberFormatException
		int num=Integer.parseInt(s);
		System.out.println(Integer.parseInt(s));
		*/
		// Ex 04
	String s1=null; //"welcome"; NullPointerException
	System.out.println(s1.length());	
	System.out.println("Program is Completed");
	System.out.println("Program is exited..");
	
	
	
	
	}

}
