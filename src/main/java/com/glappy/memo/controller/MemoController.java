package com.glappy.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.glappy.memo.model.MemoVO;

@Controller
public class MemoController {

	@RequestMapping(value="/memo_write", method=RequestMethod.GET)
	public String memo_write() {
		return "memo_write";
	}
	@RequestMapping(value="/memo_write",method=RequestMethod.POST)
	public String memo_write(long id, String m_auth, String m_date, String m_subject, 
			String m_text, String m_photo) {

		MemoVO memoVO=new MemoVO();
		memoVO.setId(id);
		memoVO.setM_auth(m_auth);
		memoVO.setM_date(m_date);
		memoVO.setM_subject(m_subject);
		memoVO.setM_text(m_text);
		memoVO.setM_photo(m_photo);
		
		return "redirect:memo_list";
	}
	@RequestMapping(value="/memo_list", method=RequestMethod.GET)
	public String memo_list() {
		return "memo_list";
	}
}
