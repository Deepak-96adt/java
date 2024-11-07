package com.mappingManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	@Column(name = "emp_id")
	private int eId;
	
	@Column(name = "emp_name")
	private String eName;
	
	@ManyToMany
	@JoinTable
	(
			name = "emp_learning",
			joinColumns = {@JoinColumn(name = "eId")},
			inverseJoinColumns = {@JoinColumn(name = "pId")}
	)
	private List<Project> project;

	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eId, String eName, List<Project> project) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.project = project;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
}
