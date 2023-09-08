package org.fi.spring.MySecondSpringApp;

import java.util.List;
import java.util.Scanner;

import org.fi.spring.MySecondSpringApp.dao.AppConfiguation;
import org.fi.spring.MySecondSpringApp.dao.UserDAO;
import org.fi.spring.MySecondSpringApp.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try(AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfiguation.class);
        		 Scanner scanner = new Scanner(System.in);)
        {
        	UserDAO userDAO=(UserDAO)applicationContext.getBean("userDAO");
        	int choice=0;
        	while(choice!=5) {
        		System.out.println("Enter choice");
        		System.out.println("1.adduser");
        		System.out.println("2.update");
        		System.out.println("3.show all");
        		System.out.println("4.");
        		choice=scanner.nextInt();
        		scanner.nextLine();
        		switch(choice)
        		{
        		case 1:{
        			System.out.println("Enter the username");
        			String userName=scanner.next();
        			
        			System.out.println("Enter the password");
        			String password=scanner.next();
        			
        			System.out.println("Enter the name");
        			String name=scanner.next();
        			
        			System.out.println("Enter the email");
        			String email=scanner.next();
        			
        			System.out.println("Enter the City");
        			String city=scanner.next();
        			
        			userDAO.addUser(userName, password, name, email, city);
        			System.out.println("record Saved");
        			
        			//sql.updateUser=update user1 set password=?,name=?,email=?,city=? where userName=?
        		}
        		 break;
        		case 2:{
        			System.out.println("Enter the username");
        			String userName=scanner.next();
        			
        			System.out.println("Enter the password");
        			String password=scanner.next();
        			
        			System.out.println("Enter the name");
        			String name=scanner.next();
        			
        			System.out.println("Enter the email");
        			String email=scanner.next();
        			
        			
        			System.out.println("Enter the city");
        			String city=scanner.next();
        			
        			userDAO.updateUser(userName, password, name, email, city);
        
        			System.out.println("Record Updated");
        			
        		}
        		System.out.println();
        		break;
        		case 3:
        		{
        		 List<User> list=userDAO.allUser();	
        		 for(User objUser: list)
        			 System.out.println(objUser);
        		}
        		break;
        		//delete from user1 where userName=?
        		case 4:
        		{
        			System.out.println("Enter the username");
        			String userName=scanner.next();
        			
        			userDAO.deleteUser(userName);
        			System.out.println("Record Deleted");
        			
        		}
        		break;
        		//update user1 set password=? where userName=?
        		case 5:
        		{
        			System.out.println("Enter the username");
        			String userName=scanner.next();
        			
        			System.out.println("Enter new password");
        			String password=scanner.next();
        			
        			userDAO.changePassword(userName, password);
        			System.out.println("Password updated");
        		}
        		break;
        		//select * from user1 where userName=?
        		case 6:
        		{
        			System.out.println("Enter the username");
        			String userName=scanner.next();
        			 
        			userDAO.getUserByUserName(userName);
        			System.out.println(userDAO);
        			
        		}
        		
        		}
        	}
         }catch(BeansException e) {
     		e.printStackTrace();
     	}
        
    }
}
