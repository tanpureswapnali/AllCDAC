<%@page import="org.fi.hibernate.entity.Category"%>
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
            	Query allCategories = hibernateSession.createQuery("from Category");
            	Iterator<Category> iter= allCategories.getResultList().iterator();
            	while(iter.hasNext())
            	{
            		Category objCategory = iter.next();
         %>
         
               <tr>
               <td><a href ='products.jsp?categoryId=<%=objCategory.getCategoryId()%>'></a> </td>
               <td><%=objCategory.getCategoryDescription() %></td>
               <td><%=objCategory.getCategoryImageUrl() %></td> 
               </tr> 
               
        <%       		
            	}
            }
       %>
       
       
       
       
       </table>
</body>
</html>