package com.glappy.memo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glappy.memo.mapper.MemoDao;
import com.glappy.memo.model.MemoVO;

@Repository
public class MemoService implements MemoDao {
	@Autowired
	MemoDao memoDao;

	@Override
	public List<MemoVO> selectAll() {
		List<MemoVO> memoList=memoDao.selectAll();
		return memoList;
	}
	@Override
	public MemoVO findById(long id) {
		MemoVO memoVO=memoDao.findById(id);
		return memoVO;
	}
	@Override
	public int delete(long id) {
		int ret=memoDao.delete(id);
		return ret;
	}
	@Override
	public int insert(MemoVO memoVO) {
		int ret=memoDao.insert(memoVO);
		return ret;
	}
	@Override
	public int update(MemoVO memoVO) {
		int ret=memoDao.update(memoVO);
		return ret;
	}
}