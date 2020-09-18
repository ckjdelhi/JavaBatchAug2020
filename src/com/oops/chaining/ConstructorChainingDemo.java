package com.oops.chaining;

class Test{
	public Test() {
		System.out.println("1");
	}
	
	public Test(int a){
		this();
		System.out.println("2");
	}
	
	public Test(String name, int age) {
		this(200);
		System.out.println("3");
	}
}
public class ConstructorChainingDemo {

	public static void main(String[] args) {
		//Test t=new Test();

		//Test t1=new Test(10);
		
		Test t2=new Test("chandan",20);
	}

}
