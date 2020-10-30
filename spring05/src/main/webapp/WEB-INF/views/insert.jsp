<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시물 정보 입니다.</h3>
	<hr color="red">
	게시물 no: ${bbsVO.no }<br> 
	게시물 제목: ${bbsVO.title }<br> 
	게시물 작성자: ${bbsVO.writer }<br> 
	게시물 내용: ${bbsVO.content }<br>
	<a href="index.jsp">게시판으로 가기</a>
	<a href="update.do">수정하는 페이지 가기</a>
	<a href="delete.do">삭제하는 페이지 가기</a>
	<!-- a태그는 무조건 webapp에서 찾는다 -->
</body>
</html>