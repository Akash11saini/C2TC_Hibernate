package com.cg.client;

import com.cg.Entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		Student student = new Student();
		StudentService service = new StudentServiceImpl();
		
		  //Create Operation 
		student.setId(100); student.setName("Akash");
		  service.addStudent(student); System.out.println("Data is added");
		  
		  
		  //Retrieve 
		  student = service.findStudentById(100);
		  System.out.println("ID is: " + student.getId());
		  System.out.println("Name is: " + student.getName());
		 

		// Update
		student = service.findStudentById(100);
		student.setName("Akash Saini");
		service.updateStudent(student);
		System.out.println("Update is Successfull");

		
		  student = service.findStudentById(100); System.out.println("ID is: " +
		  student.getId()); System.out.println("Name is: " + student.getName());
		  
		  //Delete 
		  student = service.findStudentById(100);
		  service.removeStudent(student); System.out.println("Deleted successfully");
		  
		 
	}

}
