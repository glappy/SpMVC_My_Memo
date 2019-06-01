<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(function() {
		$(document).ready(function() {
			$(".m_view").click(function() {
				let id = $(this).attr("data-id")
				location.href="/tele/memo_view?id=" + id
			
			})

		
		
		})
	})
</script>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>작성자</th>
			<th>작성날짜</th>
			<th>작성제목</th>
			<th>작성내용</th>
			<th>사진</th>
		</tr>
		<c:forEach var="memoVO" items="${MLIST}">
			<tr>
				<td>${memoVO.id}</td>
				<td>${memoVO.m_auth}</td>
				<td>${memoVO.m_date}</td>
				<td data-id="${memoVO.id}" class="m_view">${memoVO.m_subject}</td>
				<td>${memoVO.m_text}</td>
				<td>${memoVO.m_photo}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>