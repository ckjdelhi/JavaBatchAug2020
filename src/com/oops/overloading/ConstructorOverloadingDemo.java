package com.oops.overloading;

public class ConstructorOverloadingDemo {
	
	public ConstructorOverloadingDemo(){
		System.out.println("const");
	}
	public ConstructorOverloadingDemo(int a){
		System.out.println("const-1");
	}
	void show(){
		System.out.println("show");
	}

	public static void main(String[] args) {
		ConstructorOverloadingDemo obj= new ConstructorOverloadingDemo(20);
		obj.show();
		ConstructorOverloadingDemo obj2=new ConstructorOverloadingDemo();
		
	}

}
