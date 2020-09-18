package com.basic;

import java.util.Scanner;

/**
 * Enter any number: 3
 * 3 x 1 = (3x1)
 * 3 x 2 = 6
 * ...
 * ...
 * 3 x 10 = 30
 * 
 *
 */
public class MutiplicationTableDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		for(int i =1;i<=10;i++) {
			System.out.println(num +" x "+ i +" = "+ (num*i));
		}
	}

}
