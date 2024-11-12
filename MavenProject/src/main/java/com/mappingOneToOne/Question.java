package com.mappingOneToOne;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Question {
	@Id
	@Column(name = "question_id")
	private int qus_id;
	
	@Column(name = "question")
	private String qus;
	
	@OneToOne
	@JoinColumn(name = "answer_id")
	private Answer answer;	

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int qus_id, String qus, Answer answer) {
		super();
		this.qus_id = qus_id;
		this.qus = qus;
		this.answer = answer;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public int getQus_id() {
		return qus_id;
	}

	public void setQus_id(int qus_id) {
		this.qus_id = qus_id;
	}

	public String getQus() {
		return qus;
	}

	public void setQus(String qus) {
		this.qus = qus;
	}

	

	

}
