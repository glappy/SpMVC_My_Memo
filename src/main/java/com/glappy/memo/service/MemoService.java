package com.glappy.memo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.glappy.memo.mapper.MemoDao;
import com.glappy.memo.model.MemoVO;

@Service
public class MemoService{
	@Autowired
	MemoDao memoDao;

	public List<MemoVO> selectAll() {
		List<MemoVO> memoList=memoDao.selectAll();
		return memoList;
	}
	public MemoVO findById(long id) {
		MemoVO memoVO=memoDao.findById(id);
		return memoVO;
	}
	public int delete(long id) {
		int ret=memoDao.delete(id);
		return ret;
	}
	public int insert(MemoVO memoVO) {
		int ret=memoDao.insert(memoVO);
		return ret;
	}
	public int update(MemoVO memoVO) {
		int ret=memoDao.update(memoVO);
		return ret;
	}
}