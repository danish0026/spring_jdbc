package com.danish.dao;

import java.util.List;

import com.danish.model.Student;

public interface StudentDao {

	public void saveStudent(Student st);
	
	public void updateStudent(Student st);
	
	public void deleteStudent(Integer stuId);
	
	public Student getStudent(Integer stuId);

	public List<Student> getAllStudents();
}
