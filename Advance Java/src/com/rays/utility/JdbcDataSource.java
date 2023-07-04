package com.rays.utility;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {
	private static JdbcDataSource jds = null;
	private ComboPooledDataSource ds = null;
	JdbcDataSource() {
	
		try {
			ds = new ComboPooledDataSource();			
			ds.setDriverClass("com.mysql.cj.jdbc.Driver");
			ds.setJdbcUrl("jdbc:mysql://localhost:3306/marksheet");
			ds.setUser("root");
			ds.setPassword("root");
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(5);
			ds.setMaxPoolSize(50);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static JdbcDataSource getInstance() {
		if (jds == null) {
			jds = new JdbcDataSource();
		}
		return jds;
	}
	
	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		} catch(Exception e) {
			return null;
		}
	}
	
}
