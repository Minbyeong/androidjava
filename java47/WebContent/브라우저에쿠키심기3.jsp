<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie c1 = new Cookie("Subject", "spring");
	c1.setMaxAge(0);
	response.addCookie(c1);
	Cookie c2 = new Cookie("Location", "709호");
	c2.setMaxAge(0);
	response.addCookie(c2);
	Cookie c3 = new Cookie("PeopleNum", "100명");
	c3.setMaxAge(0);
	response.addCookie(c3);
	
%>
<h1>브라우저에 쿠키를 심었음.</h1>
<a href="브라우저에서쿠키가져오기.jsp">브라우저에서쿠키가져오기.</a>
</body>
</html>