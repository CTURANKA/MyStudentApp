package com.cg.studentapp.service;

import com.cg.studentapp.dao.StudentDao;
import com.cg.studentapp.dao.StudentDaoImpl;
import com.cg.studentapp.entities.StudentEntity;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao;

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	public void addStudent(StudentEntity student) {

		dao.addStudent(student);

	}

//	//@Override
//	public void updateStudent(StudentEntity student) {
//
//		dao.updateStudent(student);
//
//	}
//
//	@Override
//	public void removeStudent(Student student) {
//
//		dao.removeStudent(student);
//
//	}
//
//	@Override
//	public Student findStudentById(int id) {
//		//no need of transaction, as it's an read operation
//		Student student  = dao.getStudentById(id);
//		return student;
	}

