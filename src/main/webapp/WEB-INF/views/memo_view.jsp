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

		<p>작성자 : ${mVO.m_auth}<br />
		<p>날짜 : ${mVO.m_date}<br />
		<p>주제 : ${mVO.m_subject}<br />
		<p>내용 : ${mVO.m_text}<br />
		<p>사진 : ${mVO.m_photo}<br />

</body>
</html>