package com.rays.marksheet;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MarksheetModal {
	public void insertMethod(MarksheetBean bn) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = con1.prepareStatement("insert into 12thsheet values(?,?,?,?,?,?,?,?)");
		ps.setInt(1, bn.getNumber());
		ps.setInt(2, bn.getRollNumber());
		ps.setString(3, bn.getName());
		ps.setInt(4, bn.getHindi());
		ps.setInt(5, bn.getEnglish());
		ps.setInt(6, bn.getPhysics());
		ps.setInt(7, bn.getChemistry());
		ps.setInt(8, bn.getMaths());

		int i = ps.executeUpdate();
		System.out.println("Data Inserted : " + i);
	}

	public List Search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = con1.prepareStatement("select * from 12thsheet");
		ResultSet rs = ps.executeQuery();

		ArrayList list = new ArrayList();

		while (rs.next()) {
			MarksheetBean bn = new MarksheetBean();
			bn.setNumber(rs.getInt(1));
			bn.setRollNumber(rs.getInt(2));
			bn.setName(rs.getString(3));
			bn.setHindi(rs.getInt(4));
			bn.setEnglish(rs.getInt(5));
			bn.setPhysics(rs.getInt(6));
			bn.setChemistry(rs.getInt(7));
			bn.setMaths(rs.getInt(8));
			list.add(bn);
//			System.out.println(list);
//			System.out.print(bn.getNumber());
//			System.out.print("\t"+bn.getRollNumber());
//			System.out.print("\t"+bn.getName());
//			System.out.print("\t"+bn.getHindi());
//			System.out.print("\t"+bn.getEnglish());
//			System.out.print("\t"+bn.getPhysics());
//			System.out.print("\t"+bn.getChemistry());
//			System.out.println("\t"+bn.getMaths());

		}
		return list;
	}

	public Integer nextPK() throws Exception {
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = con1.prepareStatement("select max(no) from 12thsheet");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);
		}
		return pk + 1;
	}

	public MarksheetBean findByRollNumber(int rollNo) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

		PreparedStatement ps = con1.prepareStatement("select * from 12thsheet where roll_no = ?");

		ps.setInt(1, rollNo);

		ResultSet rs = ps.executeQuery();

		MarksheetBean bean1 = null;

		while (rs.next()) {

			bean1 = new MarksheetBean();
			bean1.setNumber(rs.getInt(1));
			bean1.setRollNumber(rs.getInt(2));
			bean1.setName(rs.getString(3));
			bean1.setHindi(rs.getInt(4));
			bean1.setEnglish(rs.getInt(5));
			bean1.setPhysics(rs.getInt(6));
			bean1.setChemistry(rs.getInt(7));
			bean1.setMaths(rs.getInt(8));
		}
		return bean1;

	}

	public List SearchbyParameter(MarksheetBean bn) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		StringBuffer sql = new StringBuffer("Select * from 12thsheet where 1=1");

		if (bn != null) {
			sql.append(" and no = " + bn.getNumber());
			System.out.println("SQL = " + sql);
		}

		PreparedStatement ps = con1.prepareStatement(sql.toString());
		ResultSet rs = ps.executeQuery();
		ArrayList list = new ArrayList();

		while (rs.next()) {
			bn = new MarksheetBean();
			bn.setNumber(rs.getInt(1));
			bn.setRollNumber(rs.getInt(2));
			bn.setName(rs.getString(3));
			bn.setHindi(rs.getInt(4));
			bn.setEnglish(rs.getInt(5));
			bn.setPhysics(rs.getInt(6));
			bn.setChemistry(rs.getInt(7));
			bn.setMaths(rs.getInt(8));
			list.add(bn);
		}
		return list;
	}

	public static void selectMethod() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = con.prepareStatement("Select * from 12thsheet");
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmt = rs.getMetaData();

		for (int i = 1; i <= rsmt.getColumnCount(); i++) {
			System.out.println("Table Name          :  " + rsmt.getTableName(i));
			System.out.println("Database Name       :  " + rsmt.getCatalogName(i));
			System.out.println("Label of Column     :  " + rsmt.getColumnLabel(i));
			System.out.println("Name of Column      :  " + rsmt.getColumnName(i));
			System.out.println("Column Class Name   :  " + rsmt.getColumnClassName(i));
			System.out.println("Type of Column      :  " + rsmt.getColumnType(i));
			System.out.println("Column Type Name    :  " + rsmt.getColumnTypeName(i));
			System.out.println("Column Display Size :  " + rsmt.getColumnDisplaySize(i));
			System.out.println("Status of Precision :  " + rsmt.getPrecision(i));
			System.out.println("Status of Scale     :  " + rsmt.getScale(i));
			System.out.println("Schema Name         :  " + rsmt.getSchemaName(i));
			System.out.println();
			System.out.println("____________________________________");
			System.out.println();
		}
	}
}
