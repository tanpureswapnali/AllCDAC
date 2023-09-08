package org.fi.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Connection connection =null;
		Statement stInsert =null;
		Scanner scanner = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			scanner = new Scanner(System.in);
			

		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_ee","root","Swap@123");
		   stInsert = connection.createStatement();
		   System.out.println("Enter id no");
		    String id =scanner.next();
		   System.out.println("Enter the name");
		   String name=scanner.next();
		   String sqlInsert= "insert into user values('"+id +"','" +name + "')";
		   System.out.println("sql : "+sqlInsert);
		   int rows= stInsert.executeUpdate(sqlInsert);
		   if(rows>0)
			   System.out.println("Record saved");
		   else
			   System.out.println("Record not saved");
			   
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(scanner!=null)
					scanner.close();
				if(stInsert!=null)
					stInsert.close();
				if(connection!=null)
					connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
