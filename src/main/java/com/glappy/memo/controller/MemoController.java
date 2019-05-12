package com.glappy.memo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.glappy.memo.model.MemoVO;

@Controller
public class MemoController {

	@RequestMapping(value="/memo_write", method=RequestMethod.GET)
	public String memo_write() {
		return "memo_write";
	}
	@RequestMapping(value="/tele/memo_list",method=RequestMethod.POST)
	public String memo_write(@RequestBody MemoVO memoVO) {
		return "/tele/memo_list";
	}
	@RequestMapping(value="/memo_list", method=RequestMethod.GET)
	public String memo_list() {
		return "memo_list";
	}
}
