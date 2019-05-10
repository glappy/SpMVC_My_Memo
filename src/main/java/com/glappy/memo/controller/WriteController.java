package com.glappy.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*<class>,<param>...으로 되어 있을 것을 보니 encodingFilter클래스를 실행할 때 
 * 매개변수로 UTF-8과 true를 넣으라는 뜻 같습니다.
 * 
 * 그 다음에 "/*"로 되어 있는 것은 단순히 클래스만 실행되고 끝이 아니라 웹에서 구현이 돼야 하니깐
 * 주소를 지정해준 것 같은데요. 
 * controller에서 return "home"하면 home.jsp를 찾아서 보여주듯이 
 * 해당 클래스를(한글코딩) 적용한 결과를 보여주는 것 같습니다.
 * -----------------
 * 일단..위와 같은 방식은 post라고 합니다. get방식은 tomcat의 server.xml?을 열어야 한다고 하는데요.
 * '맨 위에 server 프로젝트에 있었구나...'
 * 
 * 위 아래 필터네임이 같아야 한다고 해서 바꿔줬습니다. 필터로 등록 후? 맵핑을 적용해서? 그렇다는데요
 * 서버 실행해서 오류나는지 확인하라고 했는데 오류는 안보입니다.(제 눈에는요)
 * "정보: No Spring WebApplicationInitializer types detected on classpath"라고 뜨는데 무시해도 되겠죠?
 * 
 * jsp파일에 charset으로 utf-8을 선언하는 경우도 있다고 하는데요
 * 생각해보니까 charset으로 설정한 적도 있긴 한데 jsp에만 적용돼서...???
 * CRUD할 때 깨질 수 있으니까?
 * ???어차피 사용자에게 보이는 부분은 jsp파일이니까 jsp에만 charset, pageEncoding하면 되지 않나요?
 * 생각해보니깐 jsp파일에 하려면 일일이 다 설정해줘야 하니깐 web.xml에다 하는 것 같습니다.
 * 그럼...맨 윗줄에 <taglib uri=>가 자동으로 뜨게 했듯이 jsp파일 위에 자동으로 뜨게 설정하면 web.xml에 설정 안해도 되겠네요?
 * ???아닌데? 다른 jsp파일 보니까 이미 위에 자동으로 charset이나 pageEncoding이 있는데요?
 * 저는 왜 web.xml에 인코딩을 한걸까요
 * 
 * 스프링프로젝트에서는 post, get request 등 다양한 부분에서 한글 코딩이 필요해서라고 하네요.
 * 그러니까..class들이 DB와 insert, select등을 하는데 그 와중에 한글이 깨질 수 있으니까 전체적으로 설정해 준다는 것이죠?
 * 그럼 제 생각이 맞았네요. 
 * 
 * 맨 위에 <filter-name>은 객체이고 그 객체에 <param-name>을 초기값으로 세팅하는 것이라고 합니다.
 * 초기값 세팅이라서 <init>가 나왔군요. initialize라서..
 * UTF-8부분의 <param-name>은 인코딩 셋팅하는 것이고 
 * 그 아래 <param-name>은 입력한 인코딩으로 인자값을 강제 세팅할 것인지 말것인지 결정하는 것이라고.. 합니..다....
 * true이면 response객체도 미리 셋팅을 한다고 합니다.
 * 
 * <filter-mapping>부분에서는 어느 요청경로에 대해 필터를 적용할 것인지를 범위설정 한다고 합니다.
 * 딴소리이긴 한데 보니까 xml파일이 아니라 class에 설정하는 경우도 있네요.
 * 
 * servlet에서 request.setCharacterEncoding("UTF-8");을 하는 경우는 
 * 모든 소스(?)에 공통으로 추가해줘야 한다고 합니다.
 *
 * 제가 가져온 코드는 /*로 되어 있지만
 * *.do는 do경로만
 * /content/*는 content경로로 들어오는 request만 받아들인다고 합니다.
 * -----------
 * input tag도 구현하고 controller에 memo_write도 get으로 연결 했는데 틀린 부분 있습니까?
 * 없으면 CRUD class, select해서 보여주는 jsp 진행 해야 하나요*/
@Controller
public class WriteController {

	@RequestMapping(value="/memo_write", method=RequestMethod.GET)
	public String memo_write() {
		return "memo_write";
	}
	@RequestMapping(value="/memo_list", method=RequestMethod.GET)
	public String memo_list() {
		return "memo_list";
	}
}
