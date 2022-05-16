package com.cg.studentapp.dao;

import com.cg.studentapp.entities.StudentEntity;

public interface StudentDao {

	//public abstract Student getStudentById(int id);

	public abstract void addStudent(StudentEntity student);
}
//
//
//}
//	public abstract void removeStudent(Student student);
//	public abstract void updateStudent(Student student);
//
//	public abstract void commitTransaction();
//
//	public abstract void beginTransaction();