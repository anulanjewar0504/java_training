// update selected data
package com.tka.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord {
	public static void main(String[] args) {

		Connection con = null;
		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		int id;
		int num;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
			String url = "jdbc:mysql://localhost:3306/";
			String dbname = "batch189";
			String usernaem = "root";
			String password = "root";

			con = DriverManager.getConnection(url + dbname, usernaem, password);
			
			if (con == null) {
				System.out.println("could not established connection with the database");
			} else {
				System.out.println("connection is established with the database successfully...");
			}

			System.out.println();
			System.out.println();
			System.out.println("Enter id");
			id = sc.nextInt();

			System.out.println();
			System.out.println("choose number for update");
			System.out.println();
			System.out.println("1] For Changing student name");
			System.out.println("2] For Changing age");
			System.out.println("3] For Changing marks");
			num = sc.nextInt();
			System.out.println();

			switch (num) {
			case (1):
				System.out.println("Enter new student name: ");
				String name = sc.next();
				String updatenameq = "UPDATE student SET studname = ? WHERE studid = ?";
				psmt = con.prepareStatement(updatenameq);
				
				psmt.setString(1, name);
				psmt.setInt(2, id);
				psmt.execute();
				
				System.out.println("The student name is updated successfully");
			break;
			case (2):
				System.out.println("Enter current age: ");
				int age = sc.nextInt();
				String updateageq = "UPDATE student SET age = ? WHERE studid = ?";
				psmt = con.prepareStatement(updateageq);
				
				psmt.setInt(1, age);
				psmt.setInt(2, id);
				psmt.execute();
				
				System.out.println("The student age is updated successfully");
			break;
			case (3):
				System.out.println("Enter new marks: ");
				int marks = sc.nextInt();
				String updatemkq = "UPDATE student SET marks = ? WHERE studid = ?";
				psmt = con.prepareStatement(updatemkq);
				
				psmt.setInt(1, marks);
				psmt.setInt(2,id);
				psmt.execute();
				
				
				System.out.println("The student age is updated successfully");
			break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
