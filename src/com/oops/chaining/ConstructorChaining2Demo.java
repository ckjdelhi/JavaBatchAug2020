package com.oops.chaining;

class Parent{
	public Parent() {
		System.out.println("P:1");
	}
	public Parent(int a) {
		System.out.println("P:2");
	}
}
class Child extends Parent{
	public Child() {
		super(2000);
		System.out.println("C:1");
	}
}

public class ConstructorChaining2Demo {

	public static void main(String[] args) {
		Child obj = new Child();
	}

}
