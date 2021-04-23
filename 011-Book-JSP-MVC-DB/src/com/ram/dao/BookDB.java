package com.ram.dao;
import java.sql.*;

public class BookDB 
{
  public static Connection getConnection()
  throws Exception
  {
		/*
		 * Class.forName("com.mysql.jdbc.Driver"); Connection con =
		 * DriverManager.getConnection( "jdbc:mysql://localhost:3306/mydbram7", "root",
		 * "root");
		 */
	
	 String driverName = "oracle.jdbc.driver.OracleDriver";
	  Class.forName(driverName);
	  Connection con = DriverManager.getConnection(
	               "jdbc:oracle:thin:@localhost:1521:XE","Akhila","Hyderabad");
	
	return con;
  }

}
