package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.oops.encapsulation.pojo.Student;

public class SortingObjectDemo {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		
		Student s1=new Student(101, "Jithin", 1000);
		Student s2=new Student(105, "Pratyush", 1000);
		Student s3=new Student(103, "Chandan", 111);
		Student s4=new Student(102, "Tejaswani", 220);
		Student s5=new Student(101, "jithin", 1010);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		
		
		System.out.println("-----------Before Sorting--------------");
		list.forEach(obj->{
			System.out.println(obj.getRollNo()+"\t"+obj.getFirstName()+"\t"+obj.getZipCode());
		});
		
		//Default Sorting
		/*Collections.sort(list);*/
		Collections.sort(list, new ByNameASC());
		System.out.println("-----------Sorting by Name ASC--------------");
		list.forEach(obj->{
			System.out.println(obj.getRollNo()+"\t"+obj.getFirstName()+"\t"+obj.getZipCode());
		});
		
		Collections.sort(list, new ByNameDESC());
		System.out.println("-----------Sorting by Name DESC--------------");
		list.forEach(obj->{
			System.out.println(obj.getRollNo()+"\t"+obj.getFirstName()+"\t"+obj.getZipCode());
		});
		
		
		Collections.sort(list, new ByRollNumASC());
		System.out.println("-----------Sorting by RollNumber ASC--------------");
		list.forEach(obj->{
			System.out.println(obj.getRollNo()+"\t"+obj.getFirstName()+"\t"+obj.getZipCode());
		});
	}

}
