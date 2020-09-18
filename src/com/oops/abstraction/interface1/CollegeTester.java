package com.oops.abstraction.interface1;

public class CollegeTester {

	public static void main(String[] args) {
		CKCollege obj=new CKCollege();
		obj.mbaCourse();
		
		CKCollegeDelhi obj1=new CKCollegeDelhi();
		obj1.mbaCourse();
		obj1.bTechCourse();
		
		
		UGC obj3 =new CKCollegeDelhi();
		obj3.cctv();
		obj3.classRooms();
		obj3.conferenceHall();
		obj3.labs();
		obj3.library();
		
		AICTE obj4 =new CKCollegeDelhi(); //ALT + SHIFT + R
		obj4.classRooms();
		obj4.conferenceHall();
		obj4.labs();
		obj4.library();
		obj4.laptops();
		
		InterfaceB obj5 =new CKCollegeDelhi();
		obj5.insert();
		
		

	}

}
