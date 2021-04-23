package com.corejava.exceptionhandling;

public class ExceptionDemo2 {
	
	   String name=null;
	   
	  public void   show()
	  {
		  try 
		  {
		   System.out.println(name.length());
		  }
		  catch(NullPointerException e1)
		  {
			  System.out.println("I can handle :"+e1);
		  } 	  
		  
	  }
	
	

	public static void main(String[] args) {
		 
		ExceptionDemo2 ed1=new ExceptionDemo2();
		ed1.show();

	}

}
