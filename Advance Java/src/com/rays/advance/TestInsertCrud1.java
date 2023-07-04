package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsertCrud1
{
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		Statement stmt = con1.createStatement();
		int i = stmt.executeUpdate("insert into 12thsheet values(7,469,'Adesh Parteti',76,68,64,51,57)");
		System.out.println("Data Inserted : "+i);
	}
}
