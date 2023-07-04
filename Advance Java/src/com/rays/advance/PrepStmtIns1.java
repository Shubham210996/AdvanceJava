package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepStmtIns1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		PreparedStatement ps = con1.prepareStatement("insert into 12thsheet values(10,476,'Ritu Chouhan',49,34,39,43,37)");
		int i = ps.executeUpdate();
		System.out.println("Data Inserted : "+i);
	}

}
