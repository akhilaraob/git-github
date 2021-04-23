package com.corejava.collections;

import java.util.HashMap;

   class Employee
   {
	   
   }
public class HashMapDemo1 {

	public static void main(String[] args) {
		 
		
		HashMap mymap=new  HashMap();
		
		mymap.put("123","My contact no");
		mymap.put("Ravi","Address");
		mymap.put("emp",new Employee());
		mymap.put(null,null);
		
		System.out.println(mymap);
		
	}

}
