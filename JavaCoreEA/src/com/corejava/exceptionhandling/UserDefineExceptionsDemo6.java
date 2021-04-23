package com.corejava.exceptionhandling;
     class AgeNotSupportExcetpion  extends RuntimeException
     {
    	 AgeNotSupportExcetpion(String message)
    	 {
    		 System.out.println("Your Age is :"+message);
    	 }
     }     
public class UserDefineExceptionsDemo6 {

	  int age=16;
	public void checkAge() throws AgeNotSupportExcetpion
	{   
		
	    if(age<18)
	       throw	new AgeNotSupportExcetpion("Not Eligible for Voting...");
	}	
	
	public static void main(String[] args) {
		
		UserDefineExceptionsDemo6  ude=new UserDefineExceptionsDemo6();
		try {
			ude.checkAge();
		} catch (AgeNotSupportExcetpion e) {
			System.out.println("I can handle :"+e);
		}
		
	}

}
