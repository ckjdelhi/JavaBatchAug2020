package com.oops.inheritance;

public class Test {

	public static void main(String[] args) {
		GrandParent obj3 = new GrandParent();
		obj3.insert();
		
		Parent obj1=new Parent();
		obj1.show();
		obj1.insert();
		
		Child obj2=new Child();
		obj2.display();
		obj2.show();
		obj3.insert();
		
		Child2 obj4=new Child2();
		obj4.show();
		obj4.insert();
	}

}
