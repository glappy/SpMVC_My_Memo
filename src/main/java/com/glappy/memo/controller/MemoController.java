package com.glappy.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.glappy.memo.model.MemoVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemoController {

	@RequestMapping(value = "/memo_write", method = RequestMethod.GET)
	public String memo_write() {
		return "memo_write";
	}

	@RequestMapping(value = "/memo_write", method = RequestMethod.POST)
	public String memo_write(@ModelAttribute("memoVO") MemoVO memoVO, Model model) {
		MemoVO vo = new MemoVO();
		log.debug(vo.toString());
		return "redirect:/";
	}

	@RequestMapping(value = "/memo_list", method = RequestMethod.GET)
	public String memo_list() {
		return "memo_list";
	}

	@RequestMapping(value = "/memo_list", method = RequestMethod.POST, 
			produces = "text/html;charset=UTF-8")
	public String memo_list(MemoVO memoVO) {
		MemoVO vo = new MemoVO();
		log.debug(vo.toString());
		return "memo_list";
	}
}