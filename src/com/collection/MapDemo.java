package com.collection;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> errorCodes=new TreeMap<>();
		errorCodes.put(404, "Not Found");
		errorCodes.put(200, "OK");
		errorCodes.put(500, "Internal Server Error");
		errorCodes.put(201, "Created");
		errorCodes.put(400, "Bad Request");
			
		System.out.println(errorCodes.get(400));
		System.out.println(errorCodes.size());
		System.out.println(errorCodes);
		
		//All keys
		System.out.println(errorCodes.keySet());
		//All values
		System.out.println(errorCodes.values());
		//All Keys-Values
		System.out.println(errorCodes.entrySet());
		
		for(Integer k: errorCodes.keySet()) {
			System.out.println("Key="+k+"\tValue="+errorCodes.get(k));
		}
		
		Iterator<Integer> itr=errorCodes.keySet().iterator();
		while(itr.hasNext()) {
			Integer k = itr.next();
			System.out.println("Key="+k+"\tValue="+errorCodes.get(k));
		}
		
		Set<Entry<Integer, String>> entry=errorCodes.entrySet();
		for(Entry<Integer, String> obj:entry) {
			System.out.println("Key="+obj.getKey()+"\tValue="+obj.getValue());
		}
		
		Iterator<Entry<Integer, String>> itrEntry=errorCodes.entrySet().iterator();
		while(itrEntry.hasNext()) {
			Entry<Integer, String> entry2 =itrEntry.next();
			System.out.println("Key="+entry2.getKey()+"\tValue="+entry2.getValue());
		}
		
	}

}
