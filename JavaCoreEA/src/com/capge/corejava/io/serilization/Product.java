package com.capge.corejava.io.serilization;

import java.io.Serializable;

public class Product implements Serializable{
	
	private int pid;
	private String pname;
	private double price;
	
	public Product(int pid,String pname,double price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	
	public String toString()
	{
		return pid+ " "+pname+"  "+price;
	}

}
