package ch03.ex01.case04;

public class Student {
	
	static int serialNum = 10000;
	
	private int studentId;
	private String name;
	
	public Student() {
		serialNum++;
		studentId = serialNum;
	}

	public int getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setName(String name) {
		this.name = name;
	}
}
