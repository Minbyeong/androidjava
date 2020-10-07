<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String tel = request.getParameter("tel");

MemberDAO dao = new MemberDAO();
dao.create(id, pw, name, tel);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입 정보 확인</h3>
	<hr color="red">
	아이디:
	<%=id%>
	<br> 패스워드:
	<%=pw%>
	<br> 이름:
	<%=name%>
	<br> 전화번호:
	telel %>
	<br>
	<hr color="blue">
	<a href="login.html">로그인 페이지로</a>
</body>
</html>