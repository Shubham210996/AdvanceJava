package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDeleteCrud2 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		Statement stmt = con1.createStatement();
		int i = stmt.executeUpdate("delete from 12thsheet where name = 'Adesh Parteti'");
	//	int i = stmt.executeUpdate("delete from 12thsheet where roll_no = 476");
		System.out.println("Data Deleted : "+i);
	}
}
