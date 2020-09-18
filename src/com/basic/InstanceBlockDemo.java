package com.basic;
/*
 * Init block or instance block or initialization block
 */
public class InstanceBlockDemo {

	{
		System.out.println("init-1");
	}
	static {
		System.out.println("static-1");
	}
	
	public static void main(String[] args) {
		InstanceBlockDemo obj=new InstanceBlockDemo();
	}

}
