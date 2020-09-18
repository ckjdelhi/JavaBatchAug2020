package com.basic;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int num =sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Given number is Even");
		}else {
			System.out.println("Given number is Odd");
		}
		
		
		
	}

}
