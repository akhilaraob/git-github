package com.corejava.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		 
		HashMap<Integer,String> myMap=new HashMap<Integer,String>();
		
		myMap.put(100,"Ramesh");
		myMap.put(150,"Kiran");
		myMap.put(200,"Ramu Address");
		myMap.put(300,"Mohan");
		myMap.put(500,"My cahange");
		myMap.put(100,"Ramesh");
		
		System.out.println(myMap);
		
		
		  for(Map.Entry m:myMap.entrySet())
		  { 
	System.out.println("Key :" +m.getKey()+" Value : "+m.getValue());
		  
		  }
		 

}}
