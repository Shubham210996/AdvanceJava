package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynaPrepStmtUpdate1 {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		
		PreparedStatement ps = con1.prepareStatement("update 12thsheet set chem = ? where roll_no = ?");

		ps.setInt(1, 43);				
		ps.setInt(2, 480);
		
		int i = ps.executeUpdate();
		System.out.println("Data Updated : "+i);
	}
}
