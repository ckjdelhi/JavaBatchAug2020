package com.finaldemo;

/*
 * Final: this is non access modifier
 * 
 * with Variable Name: can't modify the value
 * With Method Name: can't be overridden
 * With Class Name: can't be extended
 */

class Test{
	final int a;
	public Test() {
		this.a = 5;
	}
	final void show() {
		System.out.println("Hi");
	}
}

public class FinalTester extends Test{

	public static void main(String[] args) {
		Test obj=new Test();
		System.out.println(obj.a);
		obj.show();

	}

}
