package com.basic;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Arithmetic Operator (+, -, *, /, %)
		/*int a =20;
		int b =11; 
		System.out.println(a + b); //30
		System.out.println(a - b);// 10
		System.out.println(a / b);// 2
		System.out.println(a % b);//0
		
		int num =32;
		System.out.println(num % 2 == 0);
		*/
		
		//Unary Operator (+, -, ++, --)
		//int i = 3;
		//System.out.println(++i + i++ + i--); //4 + 4 + 5
		
		//Assignment Operator (=)
		/*int a;
		a = 40;
		a = 30 + 20;*/
		
		//Relational Operator(>, <, >=, <=, !=, ==): boolean(true or false)
		/*int a =20;
		int b =30;
		System.out.println(a <= b);
		System.out.println(a == b);*/
		
		//Logical Operator (&&, ||, !)
		/*
		 *&& and operator
		 *true && true = true
		 *true && false = false
		 *false && true = false
		 *false && false = false 
		 *
		 *!! or operator
		 *true || true = true
		 *true || false = true
		 *false || true = true
		 *false || false = false 
		 */
		/*int a =20;
		int b= 30;
		int c= 10;
		System.out.println(!(b>a && b>c));
		
		System.out.println(!true);
		*/
		
		//Ternary Operator(condition?true condition:false condition)
		
		//if marks > 60 then "Pass" else "fail"
		/*int marks = 30;
		String res=marks > 60?"Pass":"Fail";
		
		if(marks>60) {
			res="Pass";
		}else {
			res="Fail";
		}
			*/
		//Bitwise operator(&, |)
		int a =5;
		System.out.println(a & 2); //0
		/*
		 * 0101
		 *&0010
		 * ----------
		  0 0 0 0
		  */
		
		//Shift Operator ((right)>>,<<(left))
		System.out.println(5>>2); // 5/(2^3)
		System.out.println(10*(2^3));//
		
	}

}
