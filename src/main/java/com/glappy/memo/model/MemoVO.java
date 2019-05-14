package com.glappy.memo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemoVO {

	private long id;
	private String m_auth;
	private String m_date;
	private String m_subject;
	private String m_text;
	private String m_photo;
	}
