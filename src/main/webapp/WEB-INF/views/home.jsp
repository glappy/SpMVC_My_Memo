<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	header{
		font-size:3rem;
		font-family:algerian;
		padding:1rem;
		height:3rem;
		background:;
		text-align:center;
		justify-content:center;
	}
	body {
		background-image:url("background.png");
		background-repeat:repeat;
		cursor:url("click.png");
	}
	h1{
		font-family:french script mt;
	}
	nav {
		font-family: sans-serif;
		font-size: 1.2rem;
	}
		
	#nav1:hover {
		font-size: 1.3rem;
		font-weight: bold;
	}
	
	#nav2:hover {
		font-size: 1.3rem;
		font-weight: bold;
	}
</style>
</head>

<header>Welcome</header>
<body>
	<center>
	<h1>Choose What You Want &#9786;</h1>
		<nav>
			<a href="/tele/memo_write" id="nav1">메모장</a> 
			<a href="/tele/memo_list" id="nav2">메모보기</a>
		</nav>
	</center>
</body>
</html>