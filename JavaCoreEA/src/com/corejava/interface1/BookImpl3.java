package com.corejava.interface1;

   interface Book3 extends NewBook
   {   String countryName="India";
	abstract   public void bookTitle();
	   public void bookAuthor();
	   public void bookPrice();
   }

public class BookImpl3  implements Book3 
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

	   @Override
		public void myNewBook() {
			System.out.println("My new JAVA BOOK");
			
		}
	   
	   
	public static void main(String[] args) {
		 
		
		  BookImpl3 book=new BookImpl3(); 
		  book.bookTitle();
		  book.bookAuthor();
		  book.bookPrice(); 
		  book.show();
		 book.myNewBook();  		
		
		
	}  	

}
