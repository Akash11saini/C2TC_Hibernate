package com.cg.dao;

import com.cg.Entity.Student;

public interface StudentDao {
	
	public abstract Student getStudentById(int id); //R
	public abstract void addStudent(Student student); //C
	public abstract void removeStudent(Student student); //D
	public abstract void updateStudent(Student student); //U
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
