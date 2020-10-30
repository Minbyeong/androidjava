<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>나는 수정하는 페이지입니다.</h1>
	검색결과: ${bbsVO2 }
	<hr color="red">
	게시물 no: ${bbsVO2.no }<br> 
	게시물 제목: ${bbsVO2.title }<br> 
	게시물 작성자: ${bbsVO2.writer }<br> 
	게시물 내용: ${bbsVO2.content }<br>
	<hr color="red">
	<a href="index.jsp">게시판으로 가기</a>
	<a href="delete.do">삭제하는 페이지 가기</a>
	
</body>
</html>