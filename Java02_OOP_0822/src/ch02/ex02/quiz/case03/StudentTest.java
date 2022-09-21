package ch02.ex02.quiz.case03;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentJ = new Student(1001, "조은별");
		studentJ.setKoreaSubject("국어", 100);
		studentJ.setMathSubject("수학", 80);
		
		
		Student studentK = new Student(1002, "김현석");
		studentK.setKoreaSubject("국어", 100);
		studentK.setMathSubject("수학", 100);
		
		studentJ.showStudentScore();
		studentK.showStudentScore();
	}
}
