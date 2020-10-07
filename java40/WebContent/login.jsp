<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    // 자동import: 해당 클래스를 클릭하고, ctrl+ahift+m
	    MemberDAO dao = new MemberDAO();
	    boolean result = dao.read(id, pw);
	    String check = "로그인 not";
	    if(result) {
	    	check = "로그인 ok";
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
		<%= check %>입니다.
	</h3>
	<hr color="green">
	아이디:
	<%=id%>
	<br>
	패스워드:
	<%=pw%>
	<br>
	<hr color="green">
	<a href="js07.html">메인 페이지로</a>
</body>
</html>