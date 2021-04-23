package com.corejava.interface1;

   interface Book 
   {   String countryName="India";
	   public void bookTitle();
	   public void bookAuthor();
	   public void bookPrice();
   }

public class BookImpl  implements Book 
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
		 
		BookImpl book=new BookImpl();
		book.bookTitle();
		book.bookAuthor();
		book.bookPrice();
		book.show();
	}

}
