package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynaPrepStmtIns1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		PreparedStatement ps = con1.prepareStatement("insert into 12thsheet values(?,?,?,?,?,?,?,?)");
		
		ps.setInt(1, 12);
		ps.setInt(2, 480);
		ps.setString(3, "Shivam Mandloi");
		ps.setInt(4, 51);
		ps.setInt(5, 14);
		ps.setInt(6, 40);
		ps.setInt(7, 23);
		ps.setInt(8, 47);
		
		int i = ps.executeUpdate();
		System.out.println("Data Inserted : "+i);
	}

}
