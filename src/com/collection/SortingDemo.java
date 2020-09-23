package com.collection;

import java.util.*;
/*
 * Default sorting will work on below data types
 * String, Integer, Float, Double, Long and all wrapper classes
 */
public class SortingDemo {

	public static void main(String[] args) {
		//Set<String> obj=new TreeSet<String>(Collections.reverseOrder());
		List<String> obj=new ArrayList<String>();
		obj.add("US");
		obj.add("Nepal");
		obj.add("India");
		obj.add("Bhutan");
		obj.add("Nepal");
		
		System.out.println(obj);
		
		Collections.sort(obj);//Ascending order
		Collections.sort(obj, Collections.reverseOrder());//Descending order
		
		System.out.println(obj);
	}

}
