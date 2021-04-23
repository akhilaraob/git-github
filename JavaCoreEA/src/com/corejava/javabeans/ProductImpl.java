package com.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
	
		ProductBean product=new ProductBean(100, "Laptop",45000);
		
		System.out.println("Product no :"+product.getPno());
		System.out.println("Product Name :"+product.getPname());
				System.out.println("Product Price :"+product.getPrice());
						
	}

}
