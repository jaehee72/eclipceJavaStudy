package ch02.ex01.case02;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		Student s2 = new Student(9000001, "리사", "무용학과");
		
		s2.showStudentInfo();
	}
}
