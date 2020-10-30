<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>나는 삭제하는 페이지입니다.</h1>
	
	<!-- 웹에피피 아래로 자동으로 페이지 넘김 -->
	<!-- % response.sendRedirect("index.jsp"); %> -->

	<hr color="red">
	<!-- 뷰즈 아래의 파일로 자동으로 넘김 -->
	<!-- <jsp:forward page="home.jsp"></jsp:forward> --><!-- 바로 넘어감 -->
	<a href="index.jsp">게시판으로 가기</a>
</body>
</html>