<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	// 1. vo를 만들어서
MemberVO vo = new MemberVO();

// 2. 전달되는 값 받은 다음, vo에 넣어야 한다.
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String tel = request.getParameter("tel");

vo.setId(id);
vo.setPw(pw);
vo.setName(name);
vo.setTel(tel);

// 3. dao 이용해서, insert처리함.
MemberDAO dao = new MemberDAO();
boolean result = dao.create(vo);

// 4. 처리결과를 client에 알려줘야 함.
String check = "회원가입 실패";
if (result) {
	check = "회원가입성공";
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
		회원가입 결과는
		<%= check %>입니다.
	</h3>
	<a href="login.html">로그인 페이지로</a>
</body>
</html>