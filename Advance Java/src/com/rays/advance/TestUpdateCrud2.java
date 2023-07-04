package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdateCrud2 
{
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		Statement stmt = con1.createStatement();
		int i = stmt.executeUpdate("update 12thsheet set math = 17 where name = 'Shivani Nargesh'");
		System.out.println("Data Updated : "+i);
		
	}
}
