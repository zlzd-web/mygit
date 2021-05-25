package com.hnjd.pojo;

public class Competitor {
    private Integer author_id;
    private String author;
    private String author_phone;
    private String author_school;
    
	public Competitor() {
		super();
	}

	public Competitor(Integer author_id, String author, String author_phone,
			String author_school) {
		super();
		this.author_id = author_id;
		this.author = author;
		this.author_phone = author_phone;
		this.author_school = author_school;
	}

	public Integer getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor_phone() {
		return author_phone;
	}

	public void setAuthor_phone(String author_phone) {
		this.author_phone = author_phone;
	}

	public String getAuthor_school() {
		return author_school;
	}

	public void setAuthor_school(String author_school) {
		this.author_school = author_school;
	}

	@Override
	public String toString() {
		return "competitor [author_id=" + author_id + ", author=" + author
				+ ", author_phone=" + author_phone + ", author_school="
				+ author_school + "]";
	}
    
}
