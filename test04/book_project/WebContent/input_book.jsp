<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>TEST4</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$('#godb').click(function() {
		$.ajax({
			url: "insert_book.jsp",
			data: {
				id: $('#id').val(),
				book_name: $('#book_name').val(),
				book_content: $('#book_content').val(),
				publisher: $('#publisher').val(),
				writer: $('#writer').val()
			},
			success: function(result) {
				alert("책이 성공적으로 등록되었습니다.")
			}
		})
	})
})
</script>
</head>
<body>
<h2>책 등록하기</h2>
<br>
책 등록 번호: <input type="text" id="id" placeholder="책 등록번호"> <br>
책 이름: <input type="text" id="book_name" placeholder="책 이름"> <br>
책 줄거리: <input type="text" id="book_content" placeholder="책 줄거리"> <br>
출판사: <input type="text" id="publisher" placeholder="출판사"> <br>
저자: <input type="text" id="writer" placeholder="저자"> <br>
<button id="godb">책 등록하기</button>
</body>
</html>