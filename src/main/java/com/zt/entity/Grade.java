package com.zt.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Grade entity. @author MyEclipse Persistence Tools
 */

public class Grade implements java.io.Serializable {

	// Fields

	private Integer gradeid;
	private String gradename;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public Grade() {
	}

	/** full constructor */
	public Grade(String gradename, Set students) {
		this.gradename = gradename;
		this.students = students;
	}

	// Property accessors

	public Integer getGradeid() {
		return this.gradeid;
	}

	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}

	public String getGradename() {
		return this.gradename;
	}

	public void setGradename(String gradename) {
		this.gradename = gradename;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}