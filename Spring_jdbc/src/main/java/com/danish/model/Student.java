package com.danish.model;

public class Student {

	private Integer stuId;
	private String firstName;
	private String lastName;
	

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student() {
		super();
	}

	public Student(Integer stuId, String firstName, String lastName) {
		super();
		this.stuId = stuId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
		public String toString() {
		return "Student [stuId=" + stuId + "firstName=" + firstName + ", lastName=" + lastName + "]";
		}
}
