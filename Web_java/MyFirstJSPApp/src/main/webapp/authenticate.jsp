<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <%
            Class.forName("com.mysql.cj.jdbc.Driver");
      try(
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_ee","root","Swap@123");
				PreparedStatement psAuthenticateUser = connection.prepareStatement("select * from user1 where userName=? and password=?");)
			{
			    String userName = request.getParameter("userName");
			    String password = request.getParameter("password");
			    psAuthenticateUser.setString(1,userName);
			    psAuthenticateUser.setString(2,password);
			    try(ResultSet result = psAuthenticateUser.executeQuery())
			    {
			    	if(result.next())
                           response.sendRedirect("category.jsp");
			    		else
			    		  response.sendRedirect("login.html");	
			    }
			}
      %>
			
      
      
      
</body>
</html>