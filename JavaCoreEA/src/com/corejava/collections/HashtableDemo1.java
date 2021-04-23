package com.corejava.collections;

import java.util.Hashtable;

class Employee1
{
	   
}

public class HashtableDemo1 {

	public static void main(String[] args) {
		
		Hashtable htable=new Hashtable();
		
		htable.put("100","Ramesh");
		htable.put("200","Ramu");
		htable.put("emp",new Employee1());
		//htable.put(null,null);
		
		System.out.println(htable);
		
		
		
	}

}
