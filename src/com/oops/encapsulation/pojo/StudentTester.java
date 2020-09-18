package com.oops.encapsulation.pojo;

public class StudentTester {

	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.setFirstName("Chandan");
		obj1.setRollNo(100);
		obj1.setZipCode(10000);
		
		Student obj2=new Student(101, "Jithin", 110000);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		Student []ar= {obj1, obj2};
		System.out.println(ar);
		for(Student s: ar) {
			System.out.println(s.getFirstName() + "\t"+ s.getRollNo() +"\t"+s.getZipCode());
		}
		
	}

}
