package com.collection;

import java.util.Comparator;

import com.oops.encapsulation.pojo.Student;

public class ByNameDESC implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getFirstName().compareToIgnoreCase(o1.getFirstName());
	}
}
