<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/css.css">
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url: 'join.do',
			data: {
				id: $('#id').val()
			},
			success: function(result) {
				$('#d1').html(result)
			} //success
		}) //ajax
	}) //click
})
</script>
</head>
<body>
<h2>id 확인</h2>
가입할 id입력: <input type="text" id="id"> <br>
<button id="b1" type="submit">눌러</button>
<hr color="red">
<div id="d1"></div>
</body>
</html>