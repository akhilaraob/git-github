package com.corejava.abstract1;


abstract     class Product2
     {
    	abstract public void  newProducts();
    	
    	public void allProducts()
    	{
    		System.out.println("HP Laptops");
    		System.out.println("HP Desktops");
    	}
    	
     }

 public class ProductImpl2  extends Product2  {
	
	 @Override
		public void newProducts() {
			System.out.println("New Product :Gamming Laptop");
			
		}
	 
	  public void show()
	  {
		  System.out.println("Local method show");
	  }

	public static void main(String[] args) {
		
		Product2 p2= new ProductImpl2();
		p2.newProducts();
		p2.allProducts();
		 
		

	}

	

}
