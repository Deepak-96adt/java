package com.mappingOneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Question1 {
	@Id
	@Column(name = "question_id")
	private int qus_id;
	@Column(name = "question")
	private String qus;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
	private List<Answer1> answers;	
	
//	@Override
//	public String toString() {
//		return "Question1 [qus_id=" + qus_id + ", qus=" + qus + ", answers=" + answers + "]";
//	}

	public List<Answer1> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer1> answers) {
		this.answers = answers;
	}

	public Question1(int qus_id, String qus, List<Answer1> answers) {
	super();
	this.qus_id = qus_id;
	this.qus = qus;
	this.answers = answers;
}

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
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
