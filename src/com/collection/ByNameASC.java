package com.collection;

import java.util.Comparator;

import com.oops.encapsulation.pojo.Student;

public class ByNameASC implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
	}
}
