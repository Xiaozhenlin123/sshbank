package com.zt.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zt.dao.StudentDao;
import com.zt.entity.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	@Override
	public Student loginStudent(Student stu) {
		//Session session= HibernateSessionFactory.getSession();
		//session.createQuery("");
		
		HibernateTemplate ht=super.getHibernateTemplate();
		List<Student> list= (List<Student>) ht.find("from Student where studentName=? and logpwd=?", stu.getStudentname(),stu.getLogpwd());
		System.out.println(list);
		Student student=list.size()>0?list.get(0):null;
		return student;
	}

	@Override
	public int addStudent(Student stu) {
		
		return 0;
	}

}
