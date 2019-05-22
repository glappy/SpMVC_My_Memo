package com.glappy.memo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.glappy.memo.mapper.MemoDao;
import com.glappy.memo.model.MemoVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemoController {

	@Autowired
	MemoDao memoDao;

	@RequestMapping(value = "/memo_write", method = RequestMethod.GET)
	public String memo_write() {
		return "memo_write";
	}

	@RequestMapping(value = "/memo_write", method = RequestMethod.POST)
	public String memo_write(MemoVO memoVO, Model model) {
		MemoVO mVO = new MemoVO();
		mVO=memoDao.selectAll();
		log.debug(mVO.toString());
		model.addAttribute("mVO", mVO);
		return "memo_write";
	}

	@RequestMapping(value = "/memo_view", method = RequestMethod.GET)
	public String memo_list() {
		return "memo_view";
	}

	@RequestMapping(value = "/memo_view", method = RequestMethod.POST, 
			produces = "text/html;charset=UTF-8")
	public String memo_view(MemoVO memoVO, Model model, String str) {
		log.debug("내가만든코드:"+memoVO.toString());

		LocalDateTime sdf = LocalDateTime.now();
		String m_date = String.valueOf(sdf);

		memoVO.setM_date(m_date);

		model.addAttribute("memoVO", memoVO);
		return "memo_view";
	}
}