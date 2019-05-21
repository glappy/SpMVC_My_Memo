package com.glappy.memo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

public interface MemoDao {

	@Select("select * from tbl_memo")
	public String selectAll();
	@Select("select * from tbl_memo where id=#{id}")
	public String findById(long id);
	@Delete("delete from tbl_memo where id=#{id}")
	public int delete(long id);
	@InsertProvider(type=MemoSQL.class, method="memo_insert")
	public int insert(long id);
	@UpdateProvider(type=MemoSQL.class, method="memo_update")
	public int update(long id);
}
