<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
           <form:form action="registerUser" modelAttribute="objUser">
           User Name:<form:input path="userName"/><br/>
           Password: <form:password path="password"/><br/>
           Name: <form:password path="name"/><br/>
           email: <form:password path="email"/><br/>
           city: <form:password path="city"/><br/>
           <form:button value="submit">Register</form:button>
           
           </form:form>
           
</body>
</html> 