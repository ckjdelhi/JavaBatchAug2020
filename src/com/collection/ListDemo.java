package com.collection;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		int arr[]= {30,40,50};
		System.out.println(arr);
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //16 buckets
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(30);
		
		/*System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(50));
		System.out.println(list.isEmpty());
		System.out.println(list.get(1));
		System.out.println(list.set(1, 20));
		System.out.println(list);*/
		System.out.println(list);
		//W-1
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//W-2
		int i=0;
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		//W-3
		//Do-while
		
		//W-4
		for(Integer obj: list) {
			System.out.println(obj);
		}
		//W-5
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//W-6: iterator using for-loop
		/*for(;itr.hasNext();) {
			System.out.println(itr.next());
		}*/
		//W-7: iterator using do-while loop
		
		//W-8
		ListIterator<Integer> listItr=list.listIterator();
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		list.forEach(a -> System.out.println(a));
		
	}

}
