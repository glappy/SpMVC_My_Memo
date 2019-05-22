package com.glappy.memo.mapper;

import org.apache.ibatis.jdbc.SQL;

public class MemoSQL {
	public String memo_insert() {
		SQL sql = new SQL()
				.INSERT_INTO("tbl_memo")
				.INTO_COLUMNS("id").INTO_VALUES("SEQ_MEMO.nextval")
				.INTO_COLUMNS("m_auth").INTO_VALUES("#{m_auth}")
				.INTO_COLUMNS("m_date").INTO_VALUES("#{m_date}")
				.INTO_COLUMNS("m_subject").INTO_VALUES("#{m_subject}")
				.INTO_COLUMNS("m_text").INTO_VALUES("#{m_text}")
				.INTO_COLUMNS("m_photo").INTO_VALUES("#{m_photo}");
		return sql.toString();
	}
	public String memo_update() {
		SQL sql = new SQL()
				.UPDATE("tbl_memo")
				.SET("id=SEQ_MEMO.nextval")
				.SET("m_auth=#{m_auth}")
				.SET("m_date=#{m_date}")
				.SET("m_subject=#{m_subject}")
				.SET("m_text=#{m_text}")
				.SET("m_photo=#{m_photo}")
				.WHERE("id=#{id}");
		return sql.toString();
	}
}