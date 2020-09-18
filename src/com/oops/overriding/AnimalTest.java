package com.oops.overriding;

class Animal{
	void walk() {
		System.out.println("Animal is walking");
	}
	void eat(String s) {
		System.out.println("Animal is eating ="+s);
	}
	void eat() {
		System.out.println("Animal is only eating");
	}
}

class Cat extends Animal{
	void eat() {
		System.out.println("Cat is eating");
	}
}

public class AnimalTest {
	public static void main(String []arg) {
		Animal a1=new Animal();
		a1.walk();
		a1.eat("grass");
		a1.eat();
		System.out.println("------------------------");
		
		Cat c1=new Cat();
		c1.eat();
		c1.walk();
		c1.eat("leaf");
	}
}
