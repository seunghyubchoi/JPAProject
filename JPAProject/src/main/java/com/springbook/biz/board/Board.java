package com.springbook.biz.board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity // 특정 클래스를 JPA가 관리하는 엔티티 클래스로 인식하는 가장 중요 어노테이션
@Table(name = "BOARD") // 매핑되는 테이블 이름 지정
public class Board {
	@Id // 식별자 필드, PK
	@GeneratedValue
	private int seq;
	
	private String title;
	
	private String writer;
	
	private String content;
	
	@Temporal(TemporalType.DATE)
	private Date regDate = new Date();
	
	private int cnt;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", cnt="
				+ cnt + "]";
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
