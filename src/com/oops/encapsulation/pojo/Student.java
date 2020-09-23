package com.oops.encapsulation.pojo;

/**
 * POJO: Plain Old Java Object
 * 1. Make all variables as private
 * 2. add default constructor
 * 3. add parameterized constructor
 * 4. add getter and setter method
 * 5. override toString() method
 */
public class Student implements Comparable<Student>{
	private int rollNo;
	private String firstName;
	private long zipCode;
	public Student() {}
	public Student(int rollNo, String firstName, long zipCode) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.zipCode = zipCode;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", zipCode=" + zipCode + "]";
	}
	
	/*
	 * CompareTo:
	 * -ve:smaller value
	 * 0: same value
	 * +ve: greter value
	 */
	@Override
	public int compareTo(Student o) {
		//ASC sorting on firstName
		return this.firstName.compareToIgnoreCase(o.firstName);
		
		//ASC rollNumber
		//return this.rollNo-o.rollNo; //101-105 = -4
	}
}
