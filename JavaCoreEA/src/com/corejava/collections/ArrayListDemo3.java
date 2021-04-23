package com.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	

	public static void main(String[] args) { 		
		
	//	ArrayList<String> myList=new ArrayList<String>();
		//ArrayList<Integer> myList=new ArrayList<Integer>();
		ArrayList<Double> myList=new ArrayList<Double>();
		//myList.add(100);
	//	myList.add("Ramesh");
		//myList.add("Ravi");
		myList.add(45.5);
		myList.add(33.2);	
		//myList.add(100);
		
		System.out.println(myList);
	 
	
	   Iterator i1=myList.iterator();
	   
	   while(i1.hasNext())
	   {
		   System.out.println(i1.next());
	   }
	   
	
		
		
		 
	}

}
