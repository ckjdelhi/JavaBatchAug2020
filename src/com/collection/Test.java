package com.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		list.add(4);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		HashSet setObj=new HashSet();
		setObj.add(4);
		setObj.add(4);
		setObj.add(5);
		
		System.out.println(setObj);

	}

}
