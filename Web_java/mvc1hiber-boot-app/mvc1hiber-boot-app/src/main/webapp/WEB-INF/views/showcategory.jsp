<%@page import="org.fi.mvc1hiberbootapp.entity.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     welcome<b><%=session.getAttribute("username")%></b><br/>
     <table border='1'>
     <tr>
          <th>Name</th>
          <th>Description</th>
          <th>Images</th>
     </tr>
     <%
         List<Category> list= (List<Category>)request.getAttribute("data");
       for(Category objCategory:list)
       {
      %>
          <tr>
          <td><a href='product?categoryId=<%=objCategory.getCategoryId()%>'><%=objCategory.getCategoryName()%></a></td>
          <td><%=objCategory.getCategoryDescription()%></td>
          <td><%=objCategory.getCategoryImageUrl() %></td>
          </tr>
    <%
       }
     %>
     </table>
     

</body>
</html>