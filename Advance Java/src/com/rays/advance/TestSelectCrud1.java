package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelectCrud1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		Statement stmt = con1.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from 12thsheet");
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getInt(2));
			System.out.print("\t"+rs.getString(3)+"     ");
			System.out.print("\t"+rs.getInt(4));
			System.out.print("\t"+rs.getInt(5));
			System.out.print("\t"+rs.getInt(6));
			System.out.print("\t"+rs.getInt(7));
			System.out.println("\t"+rs.getInt(8));
		//	System.out.println("\t"+rs.getInt(9));
		}
	}

}
