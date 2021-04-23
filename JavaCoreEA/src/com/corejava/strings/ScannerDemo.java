package com.corejava.strings;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		 
		Scanner sc=new  Scanner(System.in);
		
		System.out.println("Enter any No");
		int n=sc.nextInt();
				
		System.out.println("Enter any String");
       String name=sc.next();
       
       System.out.println("Name :"+name);
       System.out.println("Integer Value :"+n);
	}

}
