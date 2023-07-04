package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdateCrud1
{
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		Statement stmt = con1.createStatement();
		int i = stmt.executeUpdate("update 12thsheet set eng = 63 where roll_no = 449");
		System.out.println("Data Updated : "+i);
	}
}
