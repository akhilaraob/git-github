package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {
	

	public static void main(String[] args) { 		
		
		ArrayList myList=new ArrayList();
		
		myList.add(100);
		
	//	myList.add("Ramesh");
		//myList.add(45.5);
		myList.add(10);
		System.out.println(myList);
		Collections.sort(myList);
		Collections.reverse(myList);
		System.out.println(myList);
	
		/*
		 * Iterator i1=myList.iterator();
		 * 
		 * while(i1.hasNext()) { System.out.println(i1.next()); }
		 */
	
		
		
		 
	}

}
