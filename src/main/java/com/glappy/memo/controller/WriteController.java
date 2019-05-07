package com.glappy.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/* mybatis사용하기 위한 dependency: ojdbc6, mybatis, mybatis spring
 * 
 * mybatis 갖다 붙이는데 최신 버전 말고 바로 직전 버전으로 붙였습니다.
 * 앞으로 저 혼자 일할 때도 될 수 있으면 최신버전은 사용하지 말까요
 * 
 *UFT 인코딩 안하면 한글이 깨짐
 * 
 * controller를 자동으로 읽게 하려면 class에서 @controller를 붙여줌
 * 클라이언트에서 서버에 요청을 하면 톰캣이 @controller를 찾고 그 안에 있는 명령대로 service를 실행하거나
 * jsp, css등을 이용하여 화면에 정보를 보여줌...?
 * 
 * 제가 먼저 프로젝트 만들어서 초기설정하다가 프로젝트 이름을 바꿨는데요 
 * 주소창에 옛날 주소가 뜹니다(http://localhost:8080/tele/).
 * target 폴더나 xml파일들이나 다 들어가서 이름을 바꿨는데 저 주소가 나와요.
 * home화면은 제대로 뜨긴합니다.
 * 저 주소는 어디서 만들어지는 건가요
 * 다음부터는 아예 프로젝트를 지우고 새로 만들어야 할 것 같아요.
 * 
 * form에서 뭐를 적을지 몰라서 action="home.jsp"를 적었는데 오류가 나서 뺐더니 보이긴합니다.
 * 
 * 참고자료 그림1 봐주세요. w3에서 막 베끼다 label안에 value="id", value="m_auth"와 같이
 * 집어넣었는데 실행시키니 저렇게 쓰기도 전에 미리 입력이 돼 있습니다.
 * 이제 value를 코드에 집어넣으면 어떻게 되는지는 알았는데 왜 집어 넣는지 모르겠습니다.
 * 만약 value를 코딩하면 나중에 일일이 box안에 있는 텍스트를 지우고 다시 써야 하는데 왜 value를 쓰는 겁니까*/

@Controller
public class WriteController {

	@RequestMapping(value="/memo_write", method=RequestMethod.GET)
	public String memo_write() {
		return "memo_write";
	}
}
