package com.danish.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danish.dao.StudentDao;
import com.danish.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		StudentDao dao = (StudentDao) ctx.getBean("dao");
		System.out.println("Dao : "+dao);
//		// Test to save Student Object
//		Student st = new Student(2, "Hello", "World");
//
//		dao.saveStudent(st);
//
//		System.out.println("Student record is successfully inserted..");
//
//		// Test to get a Student and update the student too
//
//		Student s1 = dao.getStudent(2);
//	
//		System.out.println(s1);
//		System.out.println("Student record read is successfull..");
//
//		s1.setFirstName("Praveen-1");
//		s1.setLastName("Praveen-2");
//		dao.updateStudent(s1);
//		System.out.println("Student record is successfully updated..");
//
//		// Test to get all the student records from database

		for (Student s : dao.getAllStudents())
			System.out.println(s);
		// Test to delete a student record from database table

//		dao.deleteStudent(1);
//		System.out.println("Student record is successfully deleted..");

	}

}
