package com.corejava.abstract1;


abstract     class Product
     {
    	abstract public void  newProducts();
    	
    	public void allProducts()
    	{
    		System.out.println("HP Laptops");
    		System.out.println("HP Desktops");
    	}
    	
     }

 public class ProductImpl  extends Product  {
	
	 @Override
		public void newProducts() {
			System.out.println("New Product :Gamming Laptop");
			
		}
	 
	  public void show()
	  {
		  System.out.println("Local method show");
	  }

	public static void main(String[] args) {
		
		ProductImpl product =new ProductImpl();
		
		product.newProducts();
		product.allProducts();
		product.show();

	}

	

}
