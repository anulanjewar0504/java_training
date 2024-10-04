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
		int cnum;
		Scanner sc = new Scanner (System.in);
		ResultSet rs = null;
		Statement st1 = null;
		Statement st = null;
		PreparedStatement pt1 = null;
		PreparedStatement pt = null;
		
		System.out.println("Choose number to perform operation");
		System.out.println();
		System.out.println("1: Add new record");
		System.out.println("2: Print all records");
		System.out.println("3: Update record by id");
		System.out.println("4: Print record by id");
		
		cnum = sc.nextInt();
		
		
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
			
			
			switch (cnum) {
			case 1: System.out.println();
					System.out.println();
					
					System.out.println("Enter Student id: ");
					studid = sc.nextInt();
					System.out.println("Enter Student Name: ");
					studname = sc.next();
					System.out.println("Enter Student Age: ");
					age = sc.nextInt();
					System.out.println("Enter Student Marks: ");
					marks = sc.nextInt();
			
					String query = "INSERT INTO student VALUES (?, ?, ?, ?)";
			
					pt = con.prepareStatement(query);
					pt.setInt(1, studid);
					pt.setString(2,studname);
					pt.setInt(3,age);
					pt.setInt(4, marks);
					System.out.println("uploading data....");
					pt.execute();
			
					System.out.println("Data uploaded successfully!");
				break;
				
				
			case 2:	st = con.createStatement();
					String query2 = "SELECT * FROM student";
					rs = st.executeQuery(query2); 
					System.out.println();
					System.out.println();

					while(rs.next()) {
						System.out.println(
								"Id: "+rs.getInt(1)+
								"\nname: "+rs.getString(2)+
								"\nage: "+rs.getInt(3)+
								"\nmarks: "+rs.getInt(4));
						System.out.println();
					}
			
			
					System.out.println();
					System.out.println();
					
				break;
			case 3: int upid,upage,upmk ;
					String upname;
					System.out.println();
					System.out.println();
					System.out.println("Enter Id to select record for updation");
					upid = sc.nextInt();

					System.out.println("Enter new name: ");
					upname=sc.next();

					System.out.println("Enter new age: ");
					upage = sc.nextInt();

					System.out.println("Enter new marks: ");
					upmk = sc.nextInt();

					String query3 = "UPDATE student SET studname = ?, age = ?, marks = ? WHERE studid = ?";
					pt1 = con.prepareStatement(query3);
					pt1.setInt(1, upid);  
					pt1.setString(2, upname);
					pt1.setInt(3, upage);
					pt1.setInt(4, upmk);
					System.out.println("updating....");
//					pt1.executeUpdate();
					int rowsAffected = pt1.executeUpdate();

					if (rowsAffected > 0) {
						System.out.println("Data updated successfully!");
						con.commit();
					} else {
						System.out.println("No rows were updated.");
					}
			
			
					System.out.println();
					System.out.println();
				break;
				
			case 4: int id;
					System.out.println();
					System.out.println();
					System.out.println("Enter id to print selected data: ");
					id = sc.nextInt();			
					st1 = con.createStatement();
					String query4 = "SELECT * FROM student WHERE studid = ?";
					PreparedStatement pt2 = con.prepareStatement(query4);
					pt2.setInt(1, id);
					ResultSet rs2 = pt2.executeQuery();  

					if(rs2.next()) {
						System.out.println();
						System.out.println(
								"Id: "+rs2.getInt(1)+
								"\nname: "+rs2.getString(2)+
								"\nage: "+rs2.getInt(3)+
								"\nmarks: "+rs2.getInt(4)
								);
					} else {
						System.out.println("Record not found!");
					}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + cnum);
			}
			
			
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
			if((st != null)&& (st1 != null) ) {
				try {
					st1.close();
					st.close();
				}catch (SQLException e) {
                    e.printStackTrace();
                }
			}
			if((pt != null)&& (pt1 != null) ) {
				try {
					pt1.close();
					pt.close();
				}catch (SQLException e) {
                    e.printStackTrace();
                }
			}
		}		
		
	}
}
