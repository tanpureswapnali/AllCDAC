<%@page import="org.fi.mvc1hiberbootapp.entity.Product"%>
<%@page import="org.fi.mvc1hiberbootapp.entity.Category"%>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    welcome<b><%=session.getAttribute("userName") %></b><br/>
    <table border='1'>
    <tr>
    	<th>Name</th>
    	<th>Description</th>
    	<th>Price</th>
    	<th>image</th>
    </tr>
    <%
    List<Product> list=(List<Product>)request.getAttribute("data");
     for(Product objProduct:list)
     {
    %>
       <tr>
       <td><%=objProduct.getProductName()%></td>
       <td><%=objProduct.getProductDescription()%></td>
       <td><%=objProduct.getProductImageUrl()%></td>
       <td><%=objProduct.getProductPrice()%></td>
       </tr>
     <%
          }
     %>
    </table>
</body>
</html>