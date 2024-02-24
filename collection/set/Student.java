package com.collection.set;

public class Student implements Comparable<Student>
{
	private int rollNo;
	private String stdName;
	private String emailId;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStdName() {
		return stdName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stdName=" + stdName + ", emailId=" + emailId + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String stdName, String emailId) {
		super();
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.emailId = emailId;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
