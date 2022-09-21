package ch02.ex01.case01;

public class Student {
	// 필드
	int studentNumber;
	String studentName;
	String majorName;
	int majorCode;
	int grade;
	
	public Student() {
		System.out.println("default constructor was generated.");
	}
	
	// 메소드
	public void showStudentInfo() {
		System.out.printf("이름: %s\n학번: %d\n전공: %s",
				studentName, studentNumber, majorName);
	}
}
