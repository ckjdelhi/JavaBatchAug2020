package com.collection;

import java.util.Comparator;

import com.oops.encapsulation.pojo.Student;

public class ByRollNumASC implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRollNo()-o2.getRollNo();
	}

}
