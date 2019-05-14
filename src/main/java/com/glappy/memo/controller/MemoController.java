package com.glappy.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.glappy.memo.model.MemoVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemoController {

	@RequestMapping(value="/memo_write", method=RequestMethod.GET)
	public String memo_write() {
		return "memo_write";
	}
	@RequestMapping(value="/memo_write",method=RequestMethod.POST)
	public String memo_write(MemoVO memoVO) {
		/* 매개변수에 일일이 long id, String m_auth..와 같이 하는 것은 VO로 묶으면 될 것 같습니다
		 * jsp에서나 controller에서나 post로 설정을 했는데 메서드 문제가 있다고 405오류가 뜹니다.
		 * 그게 돼야 log가 제대로 되는지를 보던가 말던가 할 것 같은데..
		 * 일단 계속 해보겠습니다.*/
		MemoVO vo=new MemoVO();
		log.debug(vo.toString());
		return "redirect:home";
	}
	@RequestMapping(value="/memo_list", method=RequestMethod.GET)
	public String memo_list() {
		return "memo_list";
	}
}
