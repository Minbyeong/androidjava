<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	//콜백함수(call-back함수)
	//특정한 이벤트를 기다렸다가 그 이벤트가 발생하면 
	//함수가 정의되어 있는 곳으로 돌아가 자동 호출되는 함수
	//body의 하위 엘리먼트를 먼저 브라우저가 dom-tree를 구성한 후
	//콜백함수를 정의하게 되어있음.
	//브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라
	//body부분을 먼저 읽어서 dom-tree를 만들고록 해야함.
	$(function() { // body 부분을 먼저 읽고 다시 올라오게
		$('#b1').click(function() { // b1의 값을 가진 버튼을 누르면 작동
			$.ajax({ 
				url: "data/member.xml", //xml 파일 활용
				success: function(doc) { 
					console.log('xml요청 성공.')
					console.log('xml검색 결과: ' + doc)
					list = $(doc).find('record') // member.xml의 레코드 노드만 find해서 리스트에 저장 
					console.log('레코드의 개수: ' + list.length) //몇 갠지 찍어주고
					if (list.length > 0) { //레코드 개수만큼 실행 
						$(list).each(function(index, item) { //리스트를 가져와서 각 아이템을 검색
							id = $(item).find('id').text() //각각의 항목들을 다시 검색해서 저장 
							first_name = $(item).find('first_name').text()
							last_name = $(item).find('last_name').text()
							email = $(item).find('email').text()
							gender = $(item).find('gender').text()
							ip_address = $(item).find('ip_address').text()
							total = "이름: " + first_name + " " + last_name + "<br>" + "이메일: " + email + "<br>" + "성별: " + gender + "<br>" + "ip: " + ip_address + "<br>";
							$('#d1').append(total) //d1의 값을 가지고 있는 것에 찍어줌 
							
							$.ajax({ 
								url: "db1.jsp", //db2.jsp파일을 실행 
								data: {
									id: id,
									first_name: first_name,
									last_name: last_name,
									email: email,
									gender: gender,
									ip_address: ip_address //처음 저장한 내용들을 데이터로 전송 
								},
								success: function(result) { //db에 저장이 되면 성공적이라고 전송 
									if (index == 99) {
										alert('db1.jsp를 통해서 db에 넣기 성공적!')
										alert('db1.jsp전송 결과: ' + result)
									} //if
									
									/* colsole.log('db1.jsp를 통해서 db에 넣기! 성공적으로 전송!')
									colsole.log('db1.jsp의 결과: ' + result) */
								} //success
							}) //ajax
							/* console.log('이름: ' + fname + ' ' + lname)
							console.log('이메일: ' + email)
							console.log('성별: ' + gen)
							console.log('아이피: ' + ip_address) */
						}) //each: foreach랑 비슷한 놈
					} //if
				} //success
			}) //ajax
		}) //click
		
		$('#b2').click(function() {
			$.ajax({
				url: "data/member.json",
				success: function(doc) {
					console.log(doc)
					$(doc).each(function(index, item) {
						id = item.id
						first_name = item.first_name,
						last_name = item.last_name,
						email = item.email,
						gender = item.gender,
						ip_address = item.ip_address
						
						total = "id: " + id + "<br>" + "이름: " + first_name + " " + last_name + "<br>" + "이메일: " + email + "<br>" + "성별: " + gender + "<br>" + "ip: " + ip_address + "<br>";
						$('#d1').append(total)
					}) //each
				} //success
			}) //ajax
		}) //click
		
		$('#b3').click(function() {
			
		}) //click
	}) //function
</script>
</head>
<body>
<button id="b1">XML읽어오기</button>
<button id="b2">JSON읽어오기</button>
<button id="b3">DB에 넣기</button>
<hr>
<div id="d1"></div>
</body>
</html>