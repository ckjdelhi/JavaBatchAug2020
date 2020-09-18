package com.oops.overriding;

class Parent{
	void show() {
		System.out.println("P:show");
	}
	void insert() {
		System.out.println("P:insert");
	}
}

public class Child extends Parent{
	void show() {
		System.out.println("C:show");
	}
	void display() {
		System.out.println("C: display");
	}
	
	public static void main(String[] args) {
		Parent c=new Child();
		c.show();
		c.insert();
		//c.display()
		
		Child c1 = (Child)new Parent();
		c1.show();
		c1.insert();
		c1.display();
	}

}
