package ch01.ex01.case05;

import ch01.ex01.quiz.case03.Student;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s[] = new Student[2];  // [0] [1] [2]
		
		s[0] = new Student();
		s[0].input();
		s[0].output();
		
//		s[1] = new Student();
//		s[2] = new Student();
//		
//		System.out.println(s[0]);
//		System.out.println(s[1]);
//		System.out.println(s[2]);
//		System.out.println(s);
		
//		for (int i=0; i<s.length; i++) {
//			s[i] = new Student();
//			s[i].input();
//			s[i].output();
//		}
		
		for (Student ss : s) {
			ss = new Student();
			ss.input();
			ss.output();
		}
	}
}
