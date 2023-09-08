package org.fi.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement stSelect = null;
		ResultSet result = null;
		
		try {
			//2. Load a drive using which I will connect to the database
			 // [optional  >= java8]
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Loads the T4 Driver into memory and 
			
				//Registers itself with drivermanager
						
						//3. connect to the Database 
				// Driver Managar.getConnection(url,username,password);
			
			//jdbc:mysql://database_server:database_port/schema_name
				
				
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_ee","root","Swap@123");
			
				//4. allocate a statement(using a statement we can exetcue queries on the server)
			stSelect = connection.createStatement();
			
			// 5. Fire the query and generate the result 
			
			result  = stSelect.executeQuery("select * from user");
			
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString("id"));
				System.out.println(result.getString("name"));
				
				System.out.println("---------------------------------------");
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			//6. Realase all the resources
			try {
				if(result!=null)
					result.close();
				
				if(stSelect!=null) 
					stSelect.close();
				
				if(connection!=null) 
					connection.close();
				
			}
			catch(SQLException e) {
				e.printStackTrace()	;		}
		}

	}

}
