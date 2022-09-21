package quiz_arrayList;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setSubjectName(name);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScore();
			System.out.printf("학생 %s의 %s 과목 성적은 %d점입니다.\n", 
					studentName, s.getSubjectName(), s.getScore());
		}
		System.out.printf("학생 %s의 총점은 %d점입니다.\n", studentName, total);
	}
}
