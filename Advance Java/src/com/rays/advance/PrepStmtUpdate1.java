package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepStmtUpdate1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		PreparedStatement ps = con1.prepareStatement("update 12thsheet set name = 'Prateek Kashiv' where roll_no =483");
		int i = ps.executeUpdate();
		System.out.println("Data Updated : "+i);
	}

}
