package com.oops.abstraction.abstractClass;
/*
 * Abstraction: Abstract class & Interface
 * 
 * Abstract Class:
 * 1. by adding 'abstract' keyword before class 
 * 2. you can't create object of abstract class
 * 3. we can add abstract method as well as concrete method
 * 4. abstract method should not have body
 * 5. always add abstract method in abstract class
 */

abstract class AbstractDemo{
	public AbstractDemo(int a) {
		System.out.println("Constructor");
	}
	//concrete method
	void show() {
		System.out.println("HI");
	}
	
	//abstract method
	abstract void display();
}

public class Tester extends AbstractDemo {

	public Tester(int a) {
		super(a);
	}
	public static void main(String[] args) {
		//AbstractDemo obj=new AbstractDemo();
		//obj.show();
		
		Tester obj=new Tester(100);
		obj.show();
		obj.display();
	}
	void show() {
		System.out.println("Hello");
	}
	@Override
	void display() {
		System.out.println("display");	
	}
}
