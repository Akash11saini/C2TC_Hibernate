package com.cg.service;

import com.cg.Entity.Student;

public interface StudentService {
	
	public abstract Student getStudentById(int id); //R
	public abstract void addStudent(Student student); //C
	public abstract void removeStudent(Student student); //D
	public abstract void updateStudent(Student student); //U

}
