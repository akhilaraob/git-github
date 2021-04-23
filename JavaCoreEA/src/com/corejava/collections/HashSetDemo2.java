package com.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo2  {

	public static void main(String[] args) {
		
		HashSet<String> myset = new HashSet<String>();
		
		myset.add("Babu");
		myset.add("Ramesh");
		myset.add("Mahesh");
	   //myset.add(45.5);
	   //	myset.add(100);
		System.out.println(myset);
		
		
		for(String name:myset)
			System.out.println(name);
		
		
		  Iterator i1=myset.iterator();
		  
		  while(i1.hasNext())
		  { System.out.println(i1.next()); }
		 
		 

	}

}
