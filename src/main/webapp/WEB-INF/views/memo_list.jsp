<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
			<td>${memoVO.m_subject}</td>
			<td>${memoVO.m_text}</td>
			<td>${memoVO.m_photo}</td>
			<td><a href="memo_view/${memoVO.id}">삭제</a></td>
		</tr>
	</c:forEach>
		</table>
</body>
</html>