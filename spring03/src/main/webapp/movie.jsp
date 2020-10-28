<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(function() {
		//alert("환영한다.")
		$('#b1').click(function() {
			replyValue = $('#reply').val()
			$.ajax({
				url: "reply.do",
				data: {
					reply: replyValue
				},
				success: function(result) {
					alert(result)
					$('#d1').append(result)
				} //success
			}) //ajax
		}) //click
	})
</script>
</head>
<body>
<h2>좋아하는 영화 입력</h2>
<form action="movie.do">
영화제목: <input type="text" name="title"> <br>
영화관람료: <input type="text" name="price"> <br>
<button type="submit">눌러눌러눌러눌러</button>
</form>
<hr color="red">
댓글: <input type="text" id="reply"> <br>
<button id="b1" type="submit">눌러눌러눌러눌러</button>
<hr color="blue">
<div id="d1"></div>

</body>
</html>