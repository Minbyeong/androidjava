<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- dao를 이용해서 결과를 arraylist로 받아온 후, html을 만든다. -->
	<%
		BbsDAO dao = new BbsDAO();
		List<BbsVO> list = dao.all();
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
   <td class="td">게시글번호</td>
   <td class="td">제목</td>
   <td class="td">내용</td>
   <td class="td">작성자</td>
</tr>
<% for(int i = 0; i < list.size(); i++) { 
   BbsVO vo = list.get(i);
%>
<tr>
   <td><%= vo.getNo()%></td>
   <td><%= vo.getTitle() %></td>
   <td><%= vo.getContent() %></td>
   <td><%= vo.getWriter() %></td>
<% } %>
</tr>
</table>
<hr color="green">
	<a href="index.html"><button style="background: green">처음페이지로</button></a>
</body>
</html>