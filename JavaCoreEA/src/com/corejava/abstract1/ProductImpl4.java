package com.corejava.abstract1;


abstract     class Product4
     {
    	 public void  newProducts()
    	 {
    		 System.out.println("hello");
    	 }
    	
    	 Product4(int k)
    	 {
    		 System.out.println("Super clas con "+k);
    	 }
    	public void allProducts()
    	{
    		System.out.println("HP Laptops");
    		System.out.println("HP Desktops");
    	}
    	
     }

 public class ProductImpl4  extends Product4  {
	
	
	 
	 ProductImpl4(int t)
	 {
		 super(t);
		System.out.println(t); 
	 }
	 @Override
		public void newProducts() {
			System.out.println("New Product :Gamming Laptop");
			
		}
	 
	  public void show()
	  {
		  System.out.println("Local method show");
	  }

	public static void main(String[] args) {
		
		ProductImpl4 p1=new ProductImpl4(10);
		
		
		/*
		 * product.newProducts(); product.allProducts(); product.show(); ProductImpl
		 * product1 =new ProductImpl4(10);
		 */
	}

	

}
