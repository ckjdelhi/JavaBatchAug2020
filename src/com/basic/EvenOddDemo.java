package com.basic;

public class EvenOddDemo {

	public static void main(String[] args) {
		
		int num = 23;
		
		//Even Odd logic
		System.out.println(num % 2 == 0);
		
		//Even/Odd without % operator
		System.out.println((num / 2)*2 == num);
		
		//Even/Odd without Arithmetic operator 
		System.out.println((num & 2) == 0);

	}

}
