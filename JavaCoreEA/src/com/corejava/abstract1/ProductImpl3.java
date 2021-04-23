package com.corejava.abstract1;

abstract     class Product3
     {
	
	Product3()
	{
		System.out.println("Product3 Defualt constuctor..");
	}
	
    	abstract public void  newProducts();
    	
    	public void allProducts()
    	{
    		System.out.println("HP Laptops");
    		System.out.println("HP Desktops");
    	}
    	
     }

 public class ProductImpl3  extends Product3  {
	
	 @Override
		public void newProducts() {
			System.out.println("New Product :Gamming Laptop");
			
		}
	 
	  public void show()
	  {
		  System.out.println("Local method show");
	  }

	public static void main(String[] args) {
		
		ProductImpl3 p3= new ProductImpl3();
		p3.newProducts();
		p3.allProducts();
		 
		

	}

	

}
