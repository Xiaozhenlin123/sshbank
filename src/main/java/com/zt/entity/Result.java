package com.zt.entity;

import java.sql.Timestamp;

/**
 * Result entity. @author MyEclipse Persistence Tools
 */

public class Result implements java.io.Serializable {

	// Fields

	private Integer rid;
	private Integer studentno;
	private Integer subjectid;
	private Timestamp examdate;
	private Integer studentresult;

	// Constructors

	/** default constructor */
	public Result() {
	}

	/** full constructor */
	public Result(Integer studentno, Integer subjectid, Timestamp examdate,
			Integer studentresult) {
		this.studentno = studentno;
		this.subjectid = subjectid;
		this.examdate = examdate;
		this.studentresult = studentresult;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getStudentno() {
		return this.studentno;
	}

	public void setStudentno(Integer studentno) {
		this.studentno = studentno;
	}

	public Integer getSubjectid() {
		return this.subjectid;
	}

	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}

	public Timestamp getExamdate() {
		return this.examdate;
	}

	public void setExamdate(Timestamp examdate) {
		this.examdate = examdate;
	}

	public Integer getStudentresult() {
		return this.studentresult;
	}

	public void setStudentresult(Integer studentresult) {
		this.studentresult = studentresult;
	}

}