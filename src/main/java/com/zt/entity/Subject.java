package com.zt.entity;

/**
 * Subject entity. @author MyEclipse Persistence Tools
 */

public class Subject implements java.io.Serializable {

	// Fields

	private Integer subjectid;
	private String subjectname;
	private Integer classhour;
	private Integer gradeid;

	// Constructors

	/** default constructor */
	public Subject() {
	}

	/** full constructor */
	public Subject(String subjectname, Integer classhour, Integer gradeid) {
		this.subjectname = subjectname;
		this.classhour = classhour;
		this.gradeid = gradeid;
	}

	// Property accessors

	public Integer getSubjectid() {
		return this.subjectid;
	}

	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}

	public String getSubjectname() {
		return this.subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public Integer getClasshour() {
		return this.classhour;
	}

	public void setClasshour(Integer classhour) {
		this.classhour = classhour;
	}

	public Integer getGradeid() {
		return this.gradeid;
	}

	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}

}