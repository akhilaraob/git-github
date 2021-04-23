package com.corejava.exceptionhandling;

public class ExceptionDemo1 {
	
	   String name=null;
	   
	  public void   show()
	  {
		  System.out.println(name.length());
	  }
	
	

	public static void main(String[] args) {
		 
		ExceptionDemo1 ed1=new ExceptionDemo1();
		ed1.show();

	}

}
