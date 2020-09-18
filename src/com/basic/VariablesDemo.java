package com.basic;

public class VariablesDemo {
	//Global variable
	int age =20;//instance or object variable
	static int empId=101; //static variable
	
	public static void main(String[] arg) {
		//local variable
		int i=40;
		
		VariablesDemo obj = new VariablesDemo();
		
		System.out.println(empId);
		System.out.println(obj.age);
		System.out.println(i);
	}
	void show() {
		System.out.println(age);
		System.out.println(empId);
	}
	
}
