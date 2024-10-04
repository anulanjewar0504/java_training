package com.tka.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTablecopy {
	public static void main(String[] args) {
		Connection con = null;
		Statement st1 = null;
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("driver is loaded");
			String url = "jdbc:mysql://localhost:3306/";
			String dbname = "batch189";
			String usernaem = "root";
			String password = "root";
			
			
			con = DriverManager.getConnection(url+dbname,usernaem,password);
			
			if(con == null) {
				System.out.println("could not established connection with the database");
			}
			else {
				System.out.println("connection is established with the database successfully...");
			}
			
			
			
			Statement st = con.createStatement();
			String query = "SELECT * FROM student";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int sid = rs.getInt(1);
				String sname = rs.getString(2);
				int age = rs.getInt(3);
				int marks = rs.getInt(4);
				
				st1 = con.createStatement();
				String query1 = "Insert into studentcopy values('"+sid+"','"+sname+"','"+age+"','"+marks+"')";
				st1.executeUpdate(query1);
			}
			System.out.println("data uplodade");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
