<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
MemberDAO dao = new MemberDAO();
boolean result = dao.read(id);
String check = "중복된 아이디가 없습니다";
if (result) {
	check = "중복된 아이디가 있습니다";
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
		당신이 입혁한 정보의 결과는
		<%=check%>
	</h3>
</body>
</html>