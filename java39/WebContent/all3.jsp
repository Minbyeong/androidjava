<%@page import="java.util.List"%>
<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- dao를 이용해서 결과를 arraylist로 받아온 후, html을 만든다. -->
	<%
		String tel = request.getParameter("tel");
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.all2(tel);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
   td {
      width: 100px;
      text-align: center;
   }
   .td{
      background: yellow;
   }
</style>

</head>
<body>
<h3>검색결과의 개수는 <%=list.size()%>개</h3>
	
<table border="1">
<tr>
   <td class="td">아이디</td>
   <td class="td">패스워드</td>
   <td class="td">이름</td>
   <td class="td">전화번호</td>
</tr>
<% for(int i = 0; i < list.size(); i++) { 
   MemberVO vo = list.get(i);
%>
<tr>
   <td><%= vo.getId()%></td>
   <td><%= vo.getPw() %></td>
   <td><%= vo.getName() %></td>
   <td><%= vo.getTel() %></td>
</tr>

<% } %>
</table>
<hr color="green">
	<a href="index.html"><button style="background: green">처음페이지로</button></a>
</body>
</html>