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
				alert("å�� ���������� ��ϵǾ����ϴ�.")
			}
		})
	})
})
</script>
</head>
<body>
<h2>å ����ϱ�</h2>
<br>
å ��� ��ȣ: <input type="text" id="id" placeholder="å ��Ϲ�ȣ"> <br>
å �̸�: <input type="text" id="book_name" placeholder="å �̸�"> <br>
å �ٰŸ�: <input type="text" id="book_content" placeholder="å �ٰŸ�"> <br>
���ǻ�: <input type="text" id="publisher" placeholder="���ǻ�"> <br>
����: <input type="text" id="writer" placeholder="����"> <br>
<button id="godb">å ����ϱ�</button>
</body>
</html>