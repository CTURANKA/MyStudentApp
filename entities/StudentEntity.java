package com.cg.studentapp.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;







@Entity
@Table(name="students")
public class StudentEntity {
	
	private static final long serialVersionUID = 1L;
	@Id
	private Integer studentId;
	private String name;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}



