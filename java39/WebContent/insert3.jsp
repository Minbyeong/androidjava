<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	// 1. vo를 만들어서
BbsVO vo = new BbsVO();

// 2. 전달되는 값 받은 다음, vo에 넣어야 한다.
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

vo.setTitle(title);
vo.setContent(content);
vo.setWriter(writer);

// 3. dao 이용해서, insert처리함.
BbsDAO dao = new BbsDAO();
boolean result = dao.create(vo);

// 4. 처리결과를 client에 알려줘야 함.
String check = "게시물 생성 실패";
if (result) {
	check = "게시물 생성 성공";
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		게시물 생성의 결과는
		<%=check%>입니다.
	</h3>
	<hr color="green">
	<a href="index.html"><button style="background: green">처음페이지로</button></a>
	<a href="bbs.html">게시물 작성 페이지로</a>
</body>
</html>