<%@page import="org.fi.hibernate.entity.Products"%>
<%@page import="java.util.Iterator"%>
<%@page import="javax.persistence.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory" %>
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
		      
		SessionFactory hibernateFactory=(SessionFactory)application.getAttribute("hibernatefactory");
        try(Session hibernateSession= hibernateFactory.openSession();)	
		{
        	Query products = hibernateSession.createQuery("from Products");
        	Iterator<Products> iter= products.getResultList().iterator();
        	while(iter.hasNext())
        	{
        		Products objProduct = iter.next();
										 
		%>
												<tr>
													<td><%=objProduct.getProductName()%></td>
													<td><%=objProduct.getProductDescription()%></td>
													<td><%=objProduct.getProductPrice()%></td>
						<td><img src='Images/<%=objProduct.getProductImageUrl()%>' height='60px' width='60px' /></td>
												</tr>
										
		<% 
			                 }
						   
				       }
								
              
						
		%>

	</table>
</body>
</html>