package com.zt.struts;

import com.zt.dao.StudentDao;
import com.zt.entity.Student;

public class StudentAction {
	private Student stu;
	private StudentDao sd;
	
	public String login(){
		System.out.println("欢迎登录！！");
		Student student=sd.loginStudent(stu);
		if(student!=null){
			return "success";
		}
		return "input";
	}
	
	

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}



	public void setSd(StudentDao sd) {
		this.sd = sd;
	}
	
	

}
