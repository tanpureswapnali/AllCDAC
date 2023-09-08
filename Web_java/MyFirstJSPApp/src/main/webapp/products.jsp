<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border='1'>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Image</th>
		</tr>
		<%
		         Class.forName("com.mysql.cj.jdbc.Driver");
		         try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_ee","root","Swap@123");
					PreparedStatement psProductsByCategoryId = connection.prepareStatement("select * from product_1234 where categoryId=?");)		
							{
								String tmpCategoryId = request.getParameter("categoryId");
								int categoryId = Integer.parseInt(tmpCategoryId);
								psProductsByCategoryId.setInt(1, categoryId);
								try(ResultSet result = psProductsByCategoryId.executeQuery())
									{
											
										while(result.next())
											
										{
										 
		%>
												<tr>
													<td><%=result.getString("productName")%></td>
													<td><%=result.getString("productDescription")%></td>
						<td><img src='images/<%=result.getString("productImageUrl")%>' height='60px' width='60px' /></td>
												</tr>
										
			<% 
						
						
										  }
									}
								
							}
						
			%>

	</table>
</body>
</html>