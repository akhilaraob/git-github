package com.corejava.exceptionhandling;
public class ExceptionDemo5  {
	 
	   String name="null";
	   int n=0;
	    // open db connect
	  public void   show()  throws Exception
	  {      System.out.println(1);
		    System.out.println(name.length());
		   
		   System.out.println(2);
		     
		   int t=10/n;
		      System.out.println(t);
		   System.out.println(3);
		   // close connections 	 
	  } 	
	  
    public void display() throws Exception
    {   
    	show();
    }
	  
	public static void main(String[] args) {
		 
	try {	
		ExceptionDemo5 ed1=new ExceptionDemo5();
		ed1.display();
	}
	catch(Exception e)
	{
		System.out.println("I can handle..."+e);
	}

	}

}
