package com.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		
		EmployeeBean emp=new EmployeeBean();
		emp.setEname("Ramesh");
		emp.setEno(100);
		emp.setSal(55000);
		
		System.out.println("Employee No :"+emp.getEno());
		System.out.println("Emploee Name :"+emp.getEname());
		System.out.println("Employee Sal:"+emp.getSal());
		
		

	}

}
