package com.zt.entity;

import java.sql.Timestamp;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer studentno;
	private Grade grade;
	private String logpwd;
	private String studentname;
	private String sex;
	private String phone;
	private String address;
	private Timestamp borndate;
	private String email;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String logpwd, String studentname, String sex) {
		this.logpwd = logpwd;
		this.studentname = studentname;
		this.sex = sex;
	}

	/** full constructor */
	public Student(Grade grade, String logpwd, String studentname, String sex,
			String phone, String address, Timestamp borndate, String email) {
		this.grade = grade;
		this.logpwd = logpwd;
		this.studentname = studentname;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.borndate = borndate;
		this.email = email;
	}

	// Property accessors

	public Integer getStudentno() {
		return this.studentno;
	}

	public void setStudentno(Integer studentno) {
		this.studentno = studentno;
	}

	public Grade getGrade() {
		return this.grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getLogpwd() {
		return this.logpwd;
	}

	public void setLogpwd(String logpwd) {
		this.logpwd = logpwd;
	}

	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getBorndate() {
		return this.borndate;
	}

	public void setBorndate(Timestamp borndate) {
		this.borndate = borndate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}