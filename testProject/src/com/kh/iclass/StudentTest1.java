package com.kh.iclass;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student(); //1번학생생성
		student1.studentName = "김철수";
	System.out.println(student1.getStudentName());
		Student student2 = new Student(); //2번학생생성
		student2.studentName = "김유리";
System.out.println(student2.getStudentName());

	}

}
