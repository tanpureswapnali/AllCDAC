<%@ page import="org.codehaus.jackson.JsonNode"%>
<%@ page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@ page import="org.springframework.http.ResponseEntity"%>
<%@ page import="org.springframework.web.client.RestTemplate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
</head>
<body>
	<%
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost/category/1";
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		String responseBody = responseEntity.getBody();
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode root = objectMapper.readTree(responseBody);
		int categoryId = root.path("categoryId").asInt();
		String categoryName = root.path("categoryName").asText();
		String categoryDescription = root.path("categoryDescription").asText();
		String categoryImageUrl = root.path("categoryImageUrl").asText();
	%>
		Category ID: <%=categoryId%><br /> 
		Category Name: <%=categoryName%><br /> 
		Category Desc: <%=categoryDescription%><br /> 
		Category Image: <%=categoryImageUrl%><br />
</body>
</html>