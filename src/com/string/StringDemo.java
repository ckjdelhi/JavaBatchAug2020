package com.string;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="abc"; // String literals  -> string pool
		String s2=new String("abc"); //String object -> heap
		String s3="abc";
		String s4=new String("abc");
		
		//check if object are same or not we will use (==)
		//check content (.equals())
		
		if(s1 == s3) {
			System.out.println("S1 and S3 are same");
		}else {
			System.out.println("S1 and S3 are different object");
		}
		
		if(s1 == s2) {
			System.out.println("S1 and S2 are same");
		}else {
			System.out.println("S1 and S2 are different object");
		}
		
		if(s2 == s4) {
			System.out.println("S2 and S4 are same");
		}else {
			System.out.println("S2 and S4 are different object");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 contents are same");
		}else {
			System.out.println("Not same");
		}
	}

}
