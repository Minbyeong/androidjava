<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
    String id = request.getParameter("id");
    
    MemberDAO dao = new MemberDAO();
    boolean result = dao.delete(id);
    String check = "탈퇴 처리 중 문제가 발생함. 처리 안됨.";
    if(result) {
    	check = "탈퇴처리 완료.";
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>탈퇴 결과는 아래와 같습니다.</h3>
	<hr color="red">
	<span style="color: red"> <%= check %>
	</span>
	<hr color="green">
	<a href="index.html"><button style="background: green">처음페이지로</button></a>
</body>
</html>