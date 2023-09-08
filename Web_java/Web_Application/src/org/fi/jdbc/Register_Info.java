package org.fi.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Register_Info {

	public static void main(String[] args) {
		Connection connection =null;
		Statement stInsert =null;
		try{
			Scanner scanner = new Scanner(System.in);
				   
				int choice = 0;
				try {
					Scanner scanner = new Scanner(System.in);
					Connection connection1=
							
							DriverManager.getConnection("jdbc:mysql://localhost/java_ee","root","Swap@123");
				
				
				
				}
				while(choice!=5)
				 {
					System.out.println("1.Register a user");
					System.out.println("2.list all user based on city");
					System.out.println("3.update password of a user");
					System.out.println("4.Display user information based on username");
					System.out.println("exit");
					System.out.println("Enter your choice");
					choice =scanner.nextInt();
					switch (choice) {
					case 1: 
						System.out.println("Register a User");
						break;
					case 2:
						System.out.println("2. List All Users based on City");
						break;
					case 3:
						System.out.println("3. Update Password of a User");
						break;
					case 4:
						System.out.println("4. Display user information based on User Name");
						break;
					case 5:
						System.out.println("invalid");
	
					}
					
				 }	
		    }catch (SQLException e) {
				e.printStackTrace();
		    }
				
   
}
		
private static void registeruser(Scanner scanner, Connection connection) {
		try{
			
		Statement stInsert = connection.createStatement();
		System.out.println("Enter username");
		   String username =scanner.next();
		   System.out.println("Enter the password");
		   String password=scanner.next();
		   System.out.println("Enter the name");
		   String name=scanner.next();
		   System.out.println("Enter the email");
		   String email=scanner.next();
		   System.out.println("Enter the city");
		   String city=scanner.next();
		
		String sqlInsert= "insert into user1 values('"+username +"','" +password+"','"+name+"','"+email+"','"+city+"')";
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
	   	
}	   
		



	
	
}

	

