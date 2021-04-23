package com.corejava.interface1;

   interface Book1 
   {   String countryName="India";
	   public void bookTitle();
	   public void bookAuthor();
	   public void bookPrice();
   }

public class BookImpl2  implements Book1 
{
	
	public void bookTitle()
	{
		System.out.println("Corejava");
	}
	   public void bookAuthor()
	   {
		   System.out.println("Students..."+countryName);
	   }
	   public void bookPrice()
	   {
		   System.out.println("Rs. 450");
	   }
	
	   public void show()
	   {
		   System.out.println("Local Method..");
	   } 	

	public static void main(String[] args) {
		 
		/*
		 * BookImpl2 book=new BookImpl2(); 
		 * book.bookTitle(); book.bookAuthor();
		 * book.bookPrice(); book.show();
		 */
		
		Book1 b1=new BookImpl2();
		
		      b1.bookTitle();
		      b1.bookAuthor();
		      b1.bookPrice();
		     		
		
		
		
		
	}

}
