package com.glappy.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
