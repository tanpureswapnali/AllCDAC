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
        <form:form action="cddcategory" modelAttribute="objCat">
        Category Id:<form:input path="categoryId"/><br/>
           Category Name:<form:input path="categoryName"/><br/>
          CategoryDescription : <form:password path="categroyDescription"/><br/>
           CategoryImageUrl: <form:password path="categoryImageUrl"/><br/>
           
           <form:button value="submit">Register</form:button>
           
           </form:form>
        
        
</body>
</html>