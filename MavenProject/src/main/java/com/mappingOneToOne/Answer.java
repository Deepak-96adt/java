package com.mappingOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "answer_id")
	private int ans_id;
	@Column(name = "answer")
	private String ans;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "answer_id")
	private Question question;
	
	
	public Answer(int ans_id, String ans, Question question) {
		super();
		this.ans_id = ans_id;
		this.ans = ans;
		this.question = question;
	}
	public Answer() {
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
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
