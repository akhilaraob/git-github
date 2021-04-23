package com.corejava.exceptionhandling;

public class ExceptionDemo4  {
	 
	   String name="null";
	   int n=0;
	    // open db connect
	  public void   show()
	  {      System.out.println(1);
		  try 
		  {
		   System.out.println(name.length());
		   
		   System.out.println(2);
		     
		   int t=10/n;
		      System.out.println(t);
		   System.out.println(3);
		   // close connections
		  }
		  catch(NullPointerException e1)
		  {
			  System.out.println("I can handle :"+e1);
		  } 	  
		  catch(ArithmeticException e1)
		  {
			  System.out.println("I can handle :"+e1);
		  } 
		  catch(Exception e1)
		  {
			  System.out.println("I can handle :"+e1);
		  } 
		  
		  
		  finally
		  {
			  System.out.println("Finally block...");
		  }
	  }
	
	

	public static void main(String[] args) {
		 
		ExceptionDemo4 ed1=new ExceptionDemo4();
		ed1.show();

	}

}
