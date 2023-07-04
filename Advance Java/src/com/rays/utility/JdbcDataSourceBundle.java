package com.rays.utility;

import java.sql.Connection;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSourceBundle {
	private static JdbcDataSourceBundle jds = null;
	private ComboPooledDataSource ds = null;
	JdbcDataSourceBundle() {
	
		try {
			ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");
			ds = new ComboPooledDataSource();			
			ds.setDriverClass(rb.getString("driver"));
			ds.setJdbcUrl(rb.getString("url"));
			ds.setUser(rb.getString("user"));
			ds.setPassword(rb.getString("password"));
			ds.setInitialPoolSize(Integer.parseInt(rb.getString("initial")));
			ds.setAcquireIncrement(Integer.parseInt(rb.getString("acuire_increment")));
			ds.setMaxPoolSize(50);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static JdbcDataSourceBundle getInstance() {
		if (jds == null) {
			jds = new JdbcDataSourceBundle();
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
