package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Ranjitha");
	}
	
	public void studentDept() {
		System.out.println("Computer Science main branch");
	}
	
	public void studentId() {
		System.out.println("BIT12CS401");
	}
	
	
public static void main(String[] args) {
	Student s1=new Student();
	s1.collegeCode();
	s1.collegeName();
	s1.collegeRank();
	s1.deptName();
	s1.studentDept();
	s1.studentId();
	s1.collegeRank();
}
}
