package com.cg.jpastart.entituies;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setName("Akash");
		employee.setSalary(5000);
		em.persist(employee);
		
		
		Manager manager = new Manager();
		manager.setName("Trisha");
		manager.setSalary(8000);
		manager.setDepartmentName("sales");
		em.persist(manager);
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		//em.close();
		//factory.close();

	}

}
