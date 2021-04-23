package com.corejava.javabeans;

public class BookImpl {

	public static void main(String[] args) {
		BookBean b=new BookBean("Harry Potter",99);
		
		
		System.out.println("The name of the book is: " + b.getName());
		System.out.println("The pages of the book are: "+ b.getPages());

	}

}
