//Connect to database (batch189) and perform menu driven operation
package JDBCDAY2.JDBCAssignmentDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcMain {
	public static void main(String[] args) {
		Connection con = null;
		int studid ;
		String studname;
		int age;
		int marks;
		Scanner sc = new Scanner (System.in);
		
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
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
//			
//			add record
			System.out.println("Enter Student id: ");
			studid = sc.nextInt();
			System.out.println("Enter Student Name: ");
			studname = sc.next();
			System.out.println("Enter Student Age: ");
			age = sc.nextInt();
			System.out.println("Enter Student Marks: ");
			marks = sc.nextInt();
			
			String query = "INSERT INTO student VALUES (?, ?, ?, ?)";
			
			PreparedStatement pt = con.prepareStatement(query);
			pt.setInt(1, studid);
			pt.setString(2,studname);
			pt.setInt(3,age);
			pt.setInt(4, marks);
			System.out.println("uploading data....");
			pt.execute();
			
			System.out.println("Data uploaded successfully!");
			
			
//			show complete record
			Statement st = con.createStatement();
			String query2 = "SELECT * FROM student";
			ResultSet rs = st.executeQuery(query2); 
			
			while(rs.next()) {
				System.out.println(
						"Id: "+rs.getInt(1)+
						"\nname: "+rs.getString(2)+
						"\nage: "+rs.getInt(3)+
						"\nmarks: "+rs.getInt(4));
				System.out.println();
			}
			
			
			//for update
			int upid,upage,upmk ;
			String upname;
			System.out.println("Enter Id to select record for updation");
			upid = sc.nextInt();
			
			System.out.println("Enter new name: ");
			upname=sc.next();
			
			System.out.println("Enter new age: ");
			upage = sc.nextInt();
			
			System.out.println("Enter new marks: ");
			upmk = sc.nextInt();
			
			String query3 = "UPDATE student SET studname = ?, age = ?, marks = ? WHERE studid = ?";
			PreparedStatement pt1 = con.prepareStatement(query3);
			pt1.setInt(1,upid);
			pt1.setString(2,upname);
			pt1.setInt(3,upage);
			pt1.setInt(4,upmk);
			System.out.println("updating....");
			pt1.execute();
			System.out.println("updating complete");
			
//			select by id
			Statement st = con.createStatement();
			String query4 = "SELECT * FROM student";
			ResultSet rs = st.executeQuery(query2); 
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
		}
		
		
		
		
		

		
		
		
		
		
	}
}
