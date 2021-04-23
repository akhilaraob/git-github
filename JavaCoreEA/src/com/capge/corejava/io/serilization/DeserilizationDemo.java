package com.capge.corejava.io.serilization;

import java.io.ObjectInputStream;

import java.io.FileInputStream;

public class DeserilizationDemo {

	public static void main(String[] args) {
		 try
		 {
		Product p;
		//FileInputStream fis=new FileInputStream("product.txt");
		FileInputStream fis=new FileInputStream("d:\\capgdata\\product.txt");
		System.out.println("Reading Object form the stream");
		  try {
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		while((p=(Product)ois.readObject())!=null)
             {             	 
	          System.out.println(p);
             }
		  }
		   catch(Exception  e)
		  {
			   System.out.println("End of the file");
		  }
		
		
		
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex);
		 }
	}

}
