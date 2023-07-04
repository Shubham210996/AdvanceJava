package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynaprepStmtIns2 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		PreparedStatement ps = con1.prepareStatement("insert into 12thsheet values(?,?,?,?,?,?,?,?)");
		
		ps.setInt(1, 13);
		ps.setInt(2, 483);
		ps.setString(3, "Pradeep Chandravanshi");
		ps.setInt(4, 67);
		ps.setInt(5, 47);
		ps.setInt(6, 59);
		ps.setInt(7, 51);
		ps.setInt(8, 63);
		
		int i = ps.executeUpdate();
		System.out.println("Data Inserted : "+i);
 	}

}
