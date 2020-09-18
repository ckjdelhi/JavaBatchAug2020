package com.basic;

public class StaticDemo2 {

	int age=20;
	static String name="abc";
	
	{
		System.out.println("Age="+age+ "\t Name="+ name);
	}
	
	static {
		System.out.println("\t Name="+ name);
	}
	
	public static void main(String[] args) {
		StaticDemo2 obj = new StaticDemo2();
	}

}
