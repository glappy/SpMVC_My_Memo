<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/views/include/include.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	fieldset{
		border:3px solid darkgray;
		width:70%;
		margin:auto;
	}
	legend{
		color:#ff8868;
		font-size:1.5rem;
		font-weight:bold;
		font-family:sans-serif;
	}
	.label{
		font-family:sans-serif;
		color:#7bceef;
		font-size:1.2rem;
		margin:0 0 0 5px;
	}
	input{
		display:flex;
		margin:1px;
		width:100%;	
		font-size:1.2rem;
	}
</style>
<script>
</script>
</head>
<body>
	<form action="/tele/memo_list" method="POST">
	<!-- 위 코드는 일단 input에 입력된 정보들을 보내기 위한 것 같은데... 보내서 insert하려는 것 같습니다.
	post로 하는 이유는...주소창에 일일이 다 쓰기도 힘들고 생년월일이나 비밀번호 같은 것을 보호하기 위한 것 아닐까요
	post는 최소한의 보안이 보장되니까요
	입력 항목이 많을 때는 post가 데이터 크기의 제한이 없으니까 그런가 봅니다.
	그런데 사실 action은 잘 모르겠습니다.
	action이 경로를 연결해 주는 것이라고는 하는데 이걸 memo_list에 보내는 것이 맞는지 
	controller에 보내야 하는 것이었는지는 모르겠어요. 
	
	form tag는 input에 있는 정보들을 전달할 때 쓰는 코드라고 합니다.
	jsp파일에서도 '키워드'라는 말을 쓰나요?
	'action 속성은 입력받은 데이터를 처리할 서버 상의 스크립트 파일의 주소를 명시합니다.'라고 되어 있네요
	보니깐 다른 사람들은 get도 쓰는 것 같더라고요-->
	<fieldset> 
		<legend>메모작성</legend>
		
		<label for="id" class="label">ID</label> 
		<input type="text" name="id" id="id"><br />
	
		<label for="m_auth" class="label">작성자</label> 
		<input type="text" name="m_auth" id="m_auth"><br />
	
		<label for="m_date" class="label">날짜</label> 
		<input type="text" name="m_date" id="m_date" readonly><br />
	
		<label for="m_subject" class="label">주제</label> 
		<input type="text" name="m_subject" id="m_subject" ><br />
	
		<label for="m_text" class="label">내용</label> 
		<textarea rows="5" style="width:100%"></textarea>
	
		<label for="m_photo" class="label">사진</label> 
		<input type="text" name="m_photo" id="m_photo" ><br />
		
		<button type="submit" >저장</button>
		<!--  일단..button을 만들었는데 사용자가 클릭만하면 컴퓨터는 뭘 어쩌라는 건지 모르겠죠?
		a href=""과 같은 상태인 거죠.
		제 생각에 그래서 type을 넣는 것 같은데요. 
		"이 버튼은 어떤 정보를 제출(submit)하기 위한 것이야 어디로 제출해서 어떤 일을 하는지 모를겠지?
		내가 클릭 했을 시(onclick) 무슨 일을 할지 js에 상세한 내용을 적어놓을 것이니깐
		js를 뒤지다가 "save"라는 말이 나오면 거기서 시키는 대로 해"인 것 같습니다.-->
		
	</fieldset>
	</form>
</body>
</html>