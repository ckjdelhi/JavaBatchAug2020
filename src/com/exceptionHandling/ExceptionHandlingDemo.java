package com.exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/*
 * Valid Combination
 * 1. try-catch
 * 2. try-catch-catch
 * 3. try-finally
 * 4. try-catch-finally
 * 
 * Invalid Combination
 * 1. try
 * 2. catch
 * 3. finally
 * 4. catch-finally
 */
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		ExceptionHandlingDemo obj=new ExceptionHandlingDemo();
		obj.show("ABCD");
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("**********Calculator*************");
		System.out.println("1.add\n2.substract\n3.multiply\n4.divide\nEnter any operation name:");
		String name=sc.nextLine();
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
		int result= ExceptionHandlingDemo.calculator(name, num1, num2);
		
		System.out.println(name +"\t=>"+num1+"  "+ name +" "+num2+" = "+result);
		sc.close();*/
	}
	
	private static int calculator(String operation, int num1, int num2) {
		if(operation.equalsIgnoreCase("add")) {
			return num1+num2;
		}else if(operation.equalsIgnoreCase("substract")) {
			return num1-num2;
		}else if(operation.equalsIgnoreCase("multiply")) {
			return num1*num2;
		}else if(operation.equalsIgnoreCase("divide")) {
			/*if(num2 != 0)
				return num1 / num2;
			else
				return 0;*/
			try {
				return num1 / num2;
			} catch (Exception e) {
				return 0;
			}
		}
		return 0;
	}
	
	void show(String s) {
		Scanner sc=new Scanner(System.in);
		try {
			int a = sc.nextInt();
			System.out.println(s.substring(3));
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("index is not available");
		}catch(NullPointerException e) {
			System.out.println("Null value received");
		}catch(Exception e) {
			System.out.println("Normal Exception");
		}catch(Throwable e) {
			System.out.println("All exception");
		}finally {
			System.out.println("Finally Executing");
			sc.close();
		}
	}

}
