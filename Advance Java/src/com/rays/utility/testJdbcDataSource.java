package com.rays.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.rays.marksheet.MarksheetBean;

public class testJdbcDataSource {
	public static void main(String[] args) throws Exception {
		testDCP();
	}

	private static void testDCP() throws Exception {

		Connection con1 = JdbcDataSourceBundle.getConnection();
		PreparedStatement ps = con1.prepareStatement("select * from 12thsheet");
		ResultSet rs = ps.executeQuery();
		MarksheetBean bn1 = null;
		
		while(rs.next()) {
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
