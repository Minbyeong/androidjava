<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>스프링05 시작!!!</h1>
	<h3>게시판을 만들어보자.</h3>
	<form action="insert.do">
		번호: <input type="text" name="no"> <br> 
		제목: <input	type="text" name="title"> <br> 
		작성자: <input type="text" name="writer"> <br> 
		내용: <input type="text"	name="content"> <br>
		<button type="submit">눌러눌러눌러</button>
	</form>
</body>
</html>