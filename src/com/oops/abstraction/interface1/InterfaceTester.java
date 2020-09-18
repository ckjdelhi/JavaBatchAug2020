package com.oops.abstraction.interface1;
/*
 * Interface:
 * 1. we have to use 'interface' keyword instead of 'class'
 * 2. in interface all methods are by default 'abstract' and 'public'
 * 3. and all variables are by default public 'final'
 * 4. we can not create object of interface
 * 5. child class must 'implements' interface instead of 'extends'
 * 6. child class must provide the definition of all methods available in interface
 */
interface InterfaceA {
	int a = 5;
	void show();
	int display();
}

public class InterfaceTester implements InterfaceA {

	public static void main(String[] args) {
		InterfaceTester obj =new InterfaceTester();
		obj.show();
		obj.display();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int display() {
		// TODO Auto-generated method stub
		return 0;
	}

}
