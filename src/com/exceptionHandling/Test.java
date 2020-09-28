package com.exceptionHandling;

import java.io.IOException;
import java.util.Scanner;
/*
 * Checked Exception or CompileTime Exception: Compiler will force you to handle manually
 * UnChecked Exception or Runtime Exception: Compiler will not force to handle.
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		//Checked Exception
		/*File f=new File("abc.txt");
		FileInputStream fs=new FileInputStream(f);
		*/
				
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a = sc.nextInt(); //InputMismatchException
		System.out.println("Enter number 2: ");
		int b = sc.nextInt();
		
		int res= a/b; //Arithmetic Exception 
		
		System.out.println("Div = "+res);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:");
		String s1=sc.next();
		System.out.println(s1.toString());
		if(s1.length()>3)
			System.out.println(s1.charAt(3));//StringIndexOutOfBoundsException
		
		int num = Integer.parseInt(s1);//NumberFormatException
		System.out.println(num);
		
		
	}
}
