package com.jbk.day33database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jbk.day12constructor.Student;
import com.jbk.day16Collection.Arraylistjava;

public class ConnectorTest {
	public static void main(String[] args) {
		Connection con = null;
		Statement stm  = null;
		ResultSet result = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("sql driver is loaded...");
			String url = "jdbc:mysql://localhost:3306/";
			String dbname = "db2";
			String username = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url + dbname, username, password);
			
			if(con == null) {
				System.out.println("could not established connection with the database");
			}else {
				System.out.println("connection is established with the database successfully... ");
			}
			
			String query = "select * from students";
			
			stm = con.createStatement(); // to talk with database with statement
			System.out.println("statement created...");
			
			result = stm.executeQuery(query);  // passing query through the stm
			System.out.println("query is executed...");
			
			while(! result.isLast()) {
				result.next();
				int tid = result.getInt("sid");
				String tsname = result.getString("sname");
				String tscourse = result.getString("scourse");
				
				System.out.println(tid+" "+tsname+" "+tscourse);
				
//				printing by object
				
				Students t = new Students(	result.getInt("sid"),
											result.getString("sname"), 
											result.getString("scourse")
										);
				
				System.out.println();
				
				System.out.println(t);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}