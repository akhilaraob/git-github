package com.corejava.javabeans;

import java.io.Serializable;

public class BookBean{

	String name;
	int pages;
	
	public BookBean(String name,int pages) {
		this.name=name;
		this.pages=pages;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public int getPages() {
		return pages;
	}
	
}
