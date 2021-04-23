package com.capge.corejava.io.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	public static void main(String[] args)   {
		 
		try {
			//FileOutputStream fos=new FileOutputStream("product.txt");
			FileOutputStream fos=new FileOutputStream("d:\\capgdata\\product.txt");
			
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			Product p1=new Product(100, "Mouse",450);
			Product p2=new Product(200, "Keybord",550);
			Product p3=new Product(300, "HDMI Cable",1450);
			
		System.out.println("Writing Object into the Stream");	
			
		   oos.writeObject(p1);
		   oos.writeObject(p2);
		   oos.writeObject(p3);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
