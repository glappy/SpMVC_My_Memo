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
		background-image:linear-gradient(to bottom right, #ff1493, #ffd700, #00bfff);
		text-align:center;
		justify-content:center;
	}
	body {
		background-image:url("background.png");
		background-repeat:repeat;
		cursor:url("click.png");
	}
	p{
		float:right;
		width:70%;
		font-family:french script mt;
		text-align:center;
		font-size:4rem;
		font-weight:bold;
	}
	nav{
		display:inline-block;
		float:left;
		width:20%;
		font-family: sans-serif;
		padding:0.2rem;
		font-size:1.2rem;
		background-color:#90ee90;
		height:100%;
		padding:2rem;
		font-weight:bold;
		text-align:center;
	}
		
	#nav1:hover {
		background-color:#fafad2;
		padding:1rem 3rem;
		font-weight:bold;
		text-align:center;
	}
	#nav2:hover {
		background-color:#fafad2;
		padding:1rem 3rem;
		font-weight:bold;
		text-align:center;
	}
</style>
</head>

<header>Welcome</header>
<body>
	<p>Choose What You Want &#9786;</p>
		<nav>
			<a href="/tele/memo_write" id="nav1">메모장</a><br/><br/>
			<a href="/tele/memo_list" id="nav2">메모보기</a>
		</nav>
</body>
</html>