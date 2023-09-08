<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      
      <jsp:useBean id="objUser" class="org.fi.pojo.User" scope="session"></jsp:useBean>

      <jsp:setProperty property="*" name="objUser"/>
      Review user registration deatils: <br/><br/>
      User Name:<jsp:getProperty property="userName" name="objUser"/><br/><br/>
      Password:**********<br/><br/>
      Name:<jsp:getProperty property="name" name="objUser"/><br/><br/>
      Email:<jsp:getProperty property="email" name="objUser"/><br/><br/>
      City:<jsp:getProperty property="city" name="objUser"/><br/><br/>
      <a href='confirm.jsp'>Confirm</a>&nbsp;
      &nbsp;&nbsp;<a href='reviewuser.jsp'>Cancel</a>
            ${sessionScope.objUser.userName}
</body>
</html>