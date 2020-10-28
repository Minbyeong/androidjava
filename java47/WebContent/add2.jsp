<%@page import="java47.basketVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="vo" class="java47.basketVO"></jsp:useBean>
    <jsp:setProperty property="*" name="vo" />
    <%
    ArrayList<basketVO> list = null; 
    if(vo.getProduct() != null) { //vo != null이라고 하면 vo의 주소값은 계속 있기 때문에 else가 아예 작동 x 
	    if(session.getAttribute("basket2") != null) {
	    	//null이 아니라는 의미는 이미 장바구니가 만들어져있다는 얘기
	    	//기존ㅇ에 있던 세셔느로 잡아둔 장바구니 목로글 가지고 와서
	    	//거기에다가 개로운 장바구니 물건을 추가한다.
	    	list = (ArrayList<basketVO>)session.getAttribute("basket2");
		    list.add(vo);
			
	    } else {
	    	//null이라는 의미는 장바구니 목록이 안만들어져있다는 얘기
	    	list = new ArrayList<>();
		    list.add(vo);
	    }
	    session.setAttribute("basket2", list);
    } else {
	    list = (ArrayList<basketVO>)session.getAttribute("basket2");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   if(session.getAttribute("basket2") == null){
%>
      <h3>장바구니가 비어있음.</h3>
	<%
   } else{
   %>
		<h3>장바구니의 개수<%= list.size() %>개 들어있음.</h3>
		<h3>장바구니 목록</h3>
		<hr color="blue">
	<%
		for( basketVO s : list) {
	%>
		 	<%= s.getProduct() %> <%=  s.getPrice() %><br>
<% 		
		}
   }	
%>
<hr color="green">
<a href="null2.jsp">장바구니 비우기</a> <br>
<a href="장바구니에넣기2.jsp">장바구니 추가</a> <br>
</body>
</html>