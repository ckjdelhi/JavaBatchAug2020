package com.oops.encapsulation;
/**
 * Access Modifiers
 * 1. private : can be accessible within the same class
 * 2. default: can be accessible within the same package
 * 3. protected: can be accessible within the same package as well as outside of package with Inheritance
 * 4. public: can be accessible anywhere 
 * 
 *
 */
public class AccessModifiersDemo {
	
	int age =20;//default
	public String name="abc";
	private int empId =101;
	protected double salary = 10000;
		
	public static void main(String[] args) {
		AccessModifiersDemo obj=new AccessModifiersDemo();
		
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.empId);
		System.out.println(obj.salary);

	}

}
