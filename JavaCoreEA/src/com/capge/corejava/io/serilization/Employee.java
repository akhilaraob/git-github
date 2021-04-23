package com.capge.corejava.io.serilization;

public class Employee {
	
 private	int eno;
 public void setEno(int eno) {
	this.eno = eno;
}

public void setEname(String ename) {
	this.ename = ename;
}

private	String ename;
 


public String toString()
{
	return " "+eno + "  "+ ename;
}
 
 
 
 
 
 
 
}
