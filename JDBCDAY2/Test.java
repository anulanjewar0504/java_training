package JDBCDAY2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Test {
	
	public static void main(String[] args) {
		Connection con = null;
		int sid;
		String sname;
		String scourse;
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter id");
		sid=sc.nextInt();
		System.out.println("Enter name");
		sname = sc.next();
		System.out.println("Enter course");
		scourse = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("sql driver is loaded...");
			String url = "jdbc:mysql://localhost:3306/";
			String dbname = "school";
			String username = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url + dbname, username, password);
			
			if(con == null) {
				System.out.println("could not established connection with the database");
			}else {
				System.out.println("connection is established with the database successfully... ");
			}
			
			String query = "Insert into students values(?,?,?)";
			PreparedStatement pt = con.prepareStatement(query);
			
			pt.setInt(1, sid);
			pt.setString(2,sname);
			pt.setString(3, scourse);
			int rowsAffected = pt.executeUpdate(query);

			if (rowsAffected > 0) {
			  System.out.println("Data uploaded successfully!");
			} else {
			  System.out.println("Something went wrong during data upload.");
			}
//			System.out.println("datat upload succ");
			
			ResultSet rs = pt.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt(sid);
				String name = rs.getString(sname);
				String course = rs.getString(scourse);
				System.out.println(id+" "+name+" "+course);
			}
			
			
				
				
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
