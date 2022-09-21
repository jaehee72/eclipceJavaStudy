package ch04;


public class Student {

	static int serialNum = 10000;
	
	private int studentID;
	private String name;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
		
}
