<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>가입 정보 입니다.</h3>
	<hr color="red">
	id: ${memberVO.id }<br> 
	pw: ${memberVO.pw }<br> 
	name: ${memberVO.name }<br> 
	tel: ${memberVO.tel }<br>
	<a href="index.jsp">홈으로 가기</a>
	
	<!-- a태그는 무조건 webapp에서 찾는다 -->
</body>
</html>