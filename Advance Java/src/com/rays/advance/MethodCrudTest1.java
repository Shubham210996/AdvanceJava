package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;


public class MethodCrudTest1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	
	//	insertMethod();
	//	updateMethod();
	//	deleteMethod();
		selectMethod();
		
	}

	private static void selectMethod() throws Exception{
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		Statement stmt = con1.createStatement();
		ResultSet rs = stmt.executeQuery("select * from 12thsheet");
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

	private static void deleteMethod() throws Exception{
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		Statement stmt = con1.createStatement();
		int i = stmt.executeUpdate("delete from 12thsheet where name = 'Adesh Parteti'");
		System.out.println("Data Deleted : "+i);
	}

	private static void updateMethod() throws Exception{
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		Statement stmt = con1.createStatement();
		int i = stmt.executeUpdate("update 12thsheet set hin = 79 where name = 'Jyoti Kanel'");
		System.out.println("Data Updated : "+i);
	}

	private static void insertMethod() throws Exception{
		int i = 0;
		int n = 0;
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		Statement stmt = con1.createStatement();
		i = stmt.executeUpdate("insert into 12thsheet values(7,469,'Adesh Parteti',76,68,64,51,57)");
		n=n+i;
		i = stmt.executeUpdate("insert into 12thsheet values(8,471,'Sapna Sisodiya',62,34,47,53,67)");
		n=n+i;
		i = stmt.executeUpdate("insert into 12thsheet values(9,474,'Kiran Kanel',63,48,54,67,70)");
		n=n+i;
		System.out.println("Data Inserted : "+n);	
		
	}

}
