<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
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
	<nav>
		<a href="/tele/memo_write" id="nav1">메모장</a> 
		<a href="/tele/memo_list" id="nav2">메모보기</a>
	</nav>
	<h1>원하는 메뉴를 클릭하세요</h1>
</body>
</html>