<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/include.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<p>작성자 : ${memoVO.m_auth}<br />
		<p>날짜 : ${memoVO.m_date}<br />
		<p>주제 : ${memoVO.m_subject}<br />
		<p>내용 : ${memoVO.m_text}<br />
		<p>사진 : ${memoVO.m_photo}<br />

</body>
</html>