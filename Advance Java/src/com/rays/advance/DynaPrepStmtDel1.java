package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynaPrepStmtDel1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		PreparedStatement ps = con1.prepareStatement("delete from 12thsheet where no = ?");
		
		ps.setInt(1, 13);
		
		int i = ps.executeUpdate();
		System.out.println("Data Deleted : "+i);
	}

}
