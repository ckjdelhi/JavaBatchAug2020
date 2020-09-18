package com.oops.overriding;


class Human {
	void show() {
		System.out.println("H: show");
	}
	void insert() {
		System.out.println("H: insert");
	}
}

class Man extends Human{
	void show() {
		System.out.println("M: show");
	}
	void delete() {
		System.out.println("M: delete");
	}
}

public class HumanTest {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.show();
		obj.insert();
		
		Man obj1 =new Man();
		obj1.show();
		obj1.insert();
		obj1.delete();
		
		Human obj2=new Man();
		obj2.show();
		obj2.insert();
		//obj2.delete();
		
		//Man obj3 = new Human();
		
	}

}
