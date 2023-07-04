package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DynaPrepStmtSelect1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		PreparedStatement ps = con1.prepareStatement("select * from 12thsheet");
		ResultSet rs = ps.executeQuery();		
		while(rs.next())
		{
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getInt(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.print("\t"+rs.getInt(5));
			System.out.print("\t"+rs.getInt(6));
			System.out.print("\t"+rs.getInt(7));
			System.out.println("\t"+rs.getInt(8));
		}
	}

}
