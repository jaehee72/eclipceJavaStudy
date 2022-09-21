package quiz_arrayList;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentJ = new Student(1001, "J");
		studentJ.addSubject("국어", 100);
		studentJ.addSubject("수학", 50);		
		
		Student studentK = new Student(1002, "K");
		studentK.addSubject("국어", 70);
		studentK.addSubject("수학", 85);
		studentK.addSubject("영어", 100);
		
		studentJ.showStudentInfo();
		System.out.println("================================");
		studentK.showStudentInfo();
	}
}
