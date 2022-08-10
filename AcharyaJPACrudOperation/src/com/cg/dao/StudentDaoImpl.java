package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.Entity.Student;

public class StudentDaoImpl implements StudentDao{
	private EntityManager manager;
	
	

	
	public StudentDaoImpl() {
		manager = JPAUtil.getEntityManager();
	}

	

	@Override
	public Student getStudentById(int id) {
		Student student = manager.find(Student.class, id);
		return null;
	}

	@Override
	public void addStudent(Student student) {
		manager.persist(student);
		
	}

	@Override
	public void removeStudent(Student student) {
		manager.remove(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		manager.merge(student);
		
	}



	@Override
	public void commitTransaction() {
		manager.getTransaction().commit();
		
	}



	@Override
	public void beginTransaction() {
		manager.getTransaction().begin();
		
	}
	
	

}
