package com.glappy.memo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.glappy.memo.model.MemoVO;

public interface MemoDao {

	@Select("select * from tbl_memo order by id")
	public List<MemoVO> selectAll();
	
	@Select("select * from tbl_memo where id=#{id}")
	public MemoVO findById(long id);
	
	@Delete("delete from tbl_memo where id=#{id}")
	public int delete(long id);
	@InsertProvider(type=MemoSQL.class, method="memo_insert")
	public int insert(MemoVO memoVO);
	@UpdateProvider(type=MemoSQL.class, method="memo_update")
	public int update(MemoVO memoVO);
}
