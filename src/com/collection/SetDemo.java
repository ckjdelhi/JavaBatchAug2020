package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> setObj = new HashSet<Integer>();
		setObj.add(30);
		setObj.add(40);
		setObj.add(50);
		setObj.add(30);
		
		System.out.println(setObj.size());
		System.out.println(setObj);
		
		//For-loop, while, do-while will not work because we don't have index
		
		//For-Each loop
		for(Integer i: setObj) {
			System.out.println(i);
		}
		//Iterator
		Iterator<Integer>itr = setObj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
