package com.basic;

public class StaticDemo {

	static int a=10;
	int b=20;
	
	public static void main(String[] args) {
		StaticDemo obj1 =new StaticDemo();
		StaticDemo obj2 =new StaticDemo();
		StaticDemo obj3 =new StaticDemo();
		obj1.a=11;
		obj1.b=21;
		
		obj2.a=12;
		obj2.b=22;
		
		obj3.a=13;
		obj3.b=23;
		
		System.out.println(obj1.a +"  "+obj1.b);
		System.out.println(obj2.a +"  "+obj2.b);
		System.out.println(obj3.a +"  "+obj3.b);
		
		
	}
	

}
