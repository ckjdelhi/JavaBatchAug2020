package com.basic;

import java.util.Scanner;

public class MarksDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		
		if(marks> 90 && marks<=100) {
			System.out.println("You are topper");
		}else if(marks> 80 && marks<=90) {
			System.out.println("you got A grade");
		}else if(marks> 80 && marks<=90) {
			System.out.println("you got A grade");
		}else if(marks> 80 && marks<=90) {
			System.out.println("you got A grade");
		}else if(marks> 80 && marks<=90) {
			System.out.println("you got A grade");
		}else if(marks> 80 && marks<=90) {
			System.out.println("you got A grade");
		}else if(marks> 80 && marks<=90) {
			System.out.println("you got A grade");
		}else {
			System.out.println("Entered marks is not in range");
		}
		
	}

}
