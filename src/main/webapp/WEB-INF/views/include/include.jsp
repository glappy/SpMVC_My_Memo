<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	header{
		display: block;
		background: #b2d580;
		text-align:center;
		font-size:2rem;
		padding:3rem;
		font-family:sans-serif;
	}
	nav{
		background:#b2d580;
		font-family:sans-serif;
		font-size:1.2rem;		
	}
	#nav1:hover{
		background:black;
		color:#b2d680;
		font-size:1.3rem;
		font-weight:bold;
	}
	#nav2:hover{
		background:black;
		color:#b2d680;
		font-size:1.3rem;
		font-weight:bold;
	}
</style>
</head>

<body>
	<header>나의 메모장</header>
	<nav>
		<a href="/tele/memo_write" id="nav1">메모쓰기</a> 
		<a href="/tele/memo_list" id="nav2">리스트보기</a>
	</nav>

</body>
</html>