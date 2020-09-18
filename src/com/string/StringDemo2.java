package com.string;

public class StringDemo2 {

	public static void main(String[] args) {
		//String s1="C:\\Users\\Chandan\\\rDesktop\\assignments";
		//System.out.println(s1);
		
		System.out.println(""+5+5);//55
		System.out.println("abc".concat("def"));
		
		String s1="hjhhhhhhhhhhhhhasdfasferwer";
		System.out.println(s1.length());
		System.out.println(s1.substring(s1.indexOf("a")));
		System.out.println(s1.substring(15,21));
		System.out.println(s1.indexOf("a"));
		
		String a="a";
		String b="a";
		if(a.compareTo(b) == 0) {
			System.out.println("Equals");
		}else {
			System.out.println("Not equals");
		}
	}

}
