package com.jbk.day33database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jbk.day12constructor.Student;
import com.mysql.cj.xdevapi.Result;

public class Connectortest2 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stm  = null;
		ResultSet result = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded....");
			String url = "jdbc:mysql://localhost:3306/";
			String dbname = "school";
			String username = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url + dbname, username, password);
			
			if(con == null) {
				System.out.println("connection could not established...");
			}
			else {
				System.out.println("connected...");
			}
			
			String query = "select * from students";
			
			stm = con.createStatement();
			
			result = stm.executeQuery(query);
			System.out.println("Query executed successfully");
			
			ArrayList<Students> slist = new ArrayList<Students>();
			
//			while(result.next()) {
//				
//				Students t = new Students(	result.getInt("sid"),
//											result.getString("sname"),
//											result.getString("scourse")
//											);
//				slist.add(t);
//			}
			
			
			//DIRECT METHOD WITH COLOUMN NUM:
			while(result.next()) {
				slist.add(new Students(	result.getInt(1),
										result.getString(2),
										result.getString(3)
										)
						);
			}
			
			
			System.out.println("\ndata from school database and student table >>\n");
			slist.forEach(s->System.out.println(s));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(result != null) 
					result.close();
				
				if(stm != null )
					stm.close();
				
				if(con != null)
					con.close();
			}
				catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
	}
