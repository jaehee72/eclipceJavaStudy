package ch02.ex01.case02;

public class Student {
	// 필드
	int studentNumber;
	String studentName;
	String majorName;
	int majorCode;
	int grade;
	
	// 생성자_constructor
	public Student() {}
	
	public Student(int studentNumber, String studentName, String majorName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.majorName = majorName;
	}
	
	
	// 메소드
	public void showStudentInfo() {
		System.out.printf("이름: %s\n학번: %d\n전공: %s",
				studentName, studentNumber, majorName);
	}
}
