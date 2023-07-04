package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MethodPrepStmt {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

//		insertMethod();
//		updateMethod();
//		deleteMethod();
		selectMethod();
	}

	private static void selectMethod() throws Exception {
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = con1.prepareStatement("select * from 12thsheet");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
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

	private static void deleteMethod() throws Exception {
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		PreparedStatement ps = con1.prepareStatement("delete from 12thsheet where no = 12");
		int i = ps.executeUpdate();
		System.out.println("Data Deleted : "+i);
	}

	private static void updateMethod() throws Exception {
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		PreparedStatement ps = con1.prepareStatement("update 12thsheet set chem = 17 where no = 12");
		int i = ps.executeUpdate();
		System.out.println("Data Updated : "+i);
	}

	private static void insertMethod() throws Exception {
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		PreparedStatement ps = con1.prepareStatement("insert into 12thsheet values(12,480,'Shivam Mandloi',66,58,39,61,43)");
		int i = ps.executeUpdate();
		System.out.println("Data Inserted : "+i);
	}
}
