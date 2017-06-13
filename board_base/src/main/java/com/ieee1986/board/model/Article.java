package com.ieee1986.board.model;

public class Article {

	private int idx;
	private int parentIdx;
	private String title;
	private String contents;
	private int hitCount;
	private String createDate;
	private String createId;

	public Article(int idx, int parentIdx, String title, String contents, int hitCount, String createDate,
			String createId) {
		this.idx = idx;
		this.parentIdx = parentIdx;
		this.title = title;
		this.contents = contents;
		this.hitCount = hitCount;
		this.createDate = createDate;
		this.createId = createId;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getParentIdx() {
		return parentIdx;
	}

	public void setParentIdx(int parentIdx) {
		this.parentIdx = parentIdx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}
}
