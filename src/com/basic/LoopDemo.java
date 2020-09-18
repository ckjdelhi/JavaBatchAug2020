package com.basic;

public class LoopDemo {

	public static void main(String[] args) {
		/*int a =200;
		
		while(a<=100) {
			System.out.println(a);
			a++;
		}
		
		do {
			System.out.println(a);
			a++;
		}while(a<=100);
		*/
		/*for(int i = 1; i<=100; i++) {
			System.out.println(i);
		}*/
		
		//int i =1;
		/*for(;i<=10;i++) {
			System.out.println(i);
		}*/
		/*for(;i<=10;) {
			System.out.println(i);
			i++;
		}*/
		
		//Print all Even numbers 1 to 100
		for(int num=1; num<=100;num++) {
			if(num % 2 != 0) {
				continue;
				//break;
			}
			System.out.println(num);
		}
		
		
		
		
	}

}
