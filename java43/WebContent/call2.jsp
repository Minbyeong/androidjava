<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
	String result = "보통";
	String grade = request.getParameter("grade");
	if(Integer.parseInt(grade) >= 90) {
		result = "최우수";
	} else if(Integer.parseInt(grade) >= 80) {
		result = "우수";
	}
%><%= result%>