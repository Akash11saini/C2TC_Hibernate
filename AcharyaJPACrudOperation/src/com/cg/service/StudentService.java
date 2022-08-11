package com.cg.service;

import com.cg.Entity.Student;

public interface StudentService {
	
	public abstract void addStudent(Student student); //C
	public abstract void updateStudent(Student student); //U
	public abstract void removeStudent(Student student); //D

	
	public abstract Student findStudentById(int id); //R

}
