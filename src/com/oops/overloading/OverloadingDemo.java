package com.oops.overloading;

/*
 * Overloading rules:
 * 1. return type does not matter
 * 2. no. of parameter should be different
 * 3. if no. of param is same then data type should be different
 * 4. if no. of param is same and data type is also same then change the position of variable
 */
public class OverloadingDemo {
	
	public static void main(String []arg) {
		OverloadingDemo obj = new OverloadingDemo();
		obj.show(200);
		obj.insert(200, 200L);
	}

	void insert(int i, int j) {
		System.out.println("Hi-1");
	}
	void insert(int i, long j) {
		System.out.println("Hi-2");
	}

	void show(int a) { //4 bytes
		System.out.println("1");
	}
	void show(float a) { //4 bytes
		System.out.println("2");
	}
	void show(long a) { // 8 bytes
		System.out.println("3");
	}
	void show(double a) { //8 bytes
		System.out.println("4");
	}
}
