package com.basic;

/**
 * 0 or 1 = 1 bit
 * 8 bits = 1 byte
 * 1024 bytes = 1 kilo byte (KB)
 * 1024 KB = 1 Mega Byte (MB)
 * 1024 MB = 1 Gega Byte(GB)
 * 1024 GB = 1 Tera Byte(TB)
 *
 */

//Total Memory used =  88 bytes -> 36 bytes -> 9 bytes
public class DataTypesDemo {
	//Total = 22 bytes
	/*int a=200; //4 bytes
	double b = 300; //8 bytes
	long l =300; // 8 bytes
	short s=122; //2 bytes
	*/
	
	//Total = 9 bytes
	static short a1=200; //2 bytes
	static float b1 = 300.50f; //4 bytes
	static short l1 =300; // 2 bytes
	static byte s1=122; //1 bytes

	public static void main(String[] args) {
		
		DataTypesDemo obj1 =new DataTypesDemo(); //22 bytes -> 9 bytes -> 0 bytes
		DataTypesDemo obj2 = new DataTypesDemo();// 22 bytes-> 9 bytes
		DataTypesDemo obj4 =new DataTypesDemo(); //22 bytes-> 9 bytes
		DataTypesDemo obj5 = new DataTypesDemo();// 22 bytes-> 9 bytes
	}

}
