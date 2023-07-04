package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepStmtIns2 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		String sql = "insert into 12thsheet values(11,478,'Shalini Rajput',56,51,63,67,59)";
		PreparedStatement ps = con1.prepareStatement(sql);
		int i = ps.executeUpdate();
		System.out.println("Data Inserted : "+i);
		
	}
}
