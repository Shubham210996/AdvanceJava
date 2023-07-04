package com.rays.transaction;

import java.sql.Connection;
import java.sql.Statement;

import com.rays.utility.JdbcDataSource;

public class TestTransaction {
	public static void main(String[] args) throws Exception {
		Connection con = JdbcDataSource.getConnection();
		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate("insert into 12thsheet values (13,482,'Prateek Kashiv',56,62,44,51,67)");
		i = stmt.executeUpdate("insert into 12thsheet values (13,482,'Prateek Kashiv',56,62,44,51,67)");
//		i = i + 1;
		System.out.println("Data Inserted : " + i);
		con.commit();
	}
}
