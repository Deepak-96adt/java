package com.mappingOneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Answer1 {
	@Id
	@Column(name = "answer_id")
	private int ans_id;
	@Column(name = "answer")
	private String ans;
	@ManyToOne
	private Question1 question;
	
	public Answer1(int ans_id, String ans, Question1 question) {
		super();
		this.ans_id = ans_id;
		this.ans = ans;
		this.question = question;
	}
	
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Question1 getQuestion() {
		return question;
	}
	public void setQuestion(Question1 question) {
		this.question = question;
	}
	
}
