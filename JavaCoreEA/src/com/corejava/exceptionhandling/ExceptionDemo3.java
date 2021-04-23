package com.corejava.exceptionhandling;

public class ExceptionDemo3  {
	 
	   String name="null";
	   int n=2;
	  public void   show()
	  {      System.out.println(1);
		  try 
		  {
		   System.out.println(name.length());
		   
		   System.out.println(2);
		     
		   int t=10/n;
		      System.out.println(t);
		   System.out.println(3);
		  }
		  catch(NullPointerException e1)
		  {
			  System.out.println("I can handle :"+e1);
		  } 	  
		  catch(ArithmeticException e1)
		  {
			  System.out.println("I can handle :"+e1);
		  } 	
	  }
	
	

	public static void main(String[] args) {
		 
		ExceptionDemo3 ed1=new ExceptionDemo3();
		ed1.show();

	}

}
