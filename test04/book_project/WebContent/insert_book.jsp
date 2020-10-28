<%@page import="book.BookDTO"%>
<%@page import="book.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="vo" class="book.BookDTO"></jsp:useBean>
<jsp:setProperty property="*" name="vo" />
<%
BookDAO dao = new BookDAO();
boolean result = dao.create(vo);
%><%=result%>