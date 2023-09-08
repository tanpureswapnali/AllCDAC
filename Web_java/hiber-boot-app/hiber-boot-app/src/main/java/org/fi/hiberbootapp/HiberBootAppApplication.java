package org.fi.hiberbootapp;

import java.util.Scanner;

import org.fi.hiberbootapp.entity.Category;
import org.fi.hiberbootapp.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="org.fi.hiberbootapp.entity")
public class HiberBootAppApplication implements CommandLineRunner {

	 @Autowired
	 SessionFactory hibernateFactory;
	public static void main(String[] args) {
		SpringApplication.run(HiberBootAppApplication.class, args);
	}
     
	
	@Override
	public void run(String... args)throws Exception
	{
		try(Scanner scanner = new Scanner(System.in);
				Session hibernateSession= hibernateFactory.openSession())
		{
			 System.out.println("Enter the category Name");
			 String categoryName=scanner.next();
			 
			 System.out.println("Enter the category Description");
			 String categoryDescription=scanner.next();
			 
			 
			 System.out.println("Enter the category image url");
			 String categoryImageUrl=scanner.next();
			 
			 
			 
			 Category objCategory=new Category(categoryName,categoryDescription,categoryImageUrl);
			 
			 
			 hibernateSession.beginTransaction();
			 hibernateSession.save(objCategory);
			 hibernateSession.getTransaction().commit();
			 
			 System.out.println("Record Save");
		}
	
	
	
		try(Scanner scanner = new Scanner(System.in);
				Session hibernateSession= hibernateFactory.openSession())
		{
			
			System.out.println("Enter the product name");
			 int productId=scanner.nextInt();
			 
			 System.out.println("Enter the product name");
			 String productName=scanner.next();
			 
			 System.out.println("Enter the product Description");
			 String productDescription=scanner.next();
			 
			 
			 System.out.println("Enter the product image url");
			 String productImageUrl=scanner.next();
			 
			 
			 
			 Product objproduct=new Product(productId,productName,productDescription,productImageUrl);
			 
			 
			 hibernateSession.beginTransaction();
			 hibernateSession.save(objproduct);
			 hibernateSession.getTransaction().commit();
			 
			 System.out.println("Record Save");
		}
	}
}











