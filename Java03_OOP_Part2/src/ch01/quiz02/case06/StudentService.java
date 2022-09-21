package ch01.quiz02.case06;

import java.util.Scanner;


public class StudentService {
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.println("선택 : ");
		return sc.nextInt();
}
	public void input(StudentChild[] student) {
		if (cnt == student.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		}else {
			student[cnt] = new StudentChild();
			System.out.println("학번 입력 : ");
			student[cnt].setNum(sc.nextInt());
			System.out.println("이름 입력: ");
			student[cnt].setName(sc.next());
			System.out.println("전공 입력 : ");
			student[cnt].setSubject(sc.next());
			System.out.println("성별 입력: ");
			student[cnt].setGender(sc.next());
			System.out.println("나이 입력: ");
			student[cnt].setAge(sc.nextInt());
			cnt++;
		}
	}
	public void output(StudentChild[] student) {
		if(cnt == 0) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i =0; i<cnt;i++) {
				
				System.out.println(student[i].getNum());
				System.out.println(student[i].getName());
				System.out.println(student[i].getSubject());
				System.out.println(student[i].getGender());
				System.out.println(student[i].getAge());
				
				
			}
		}
	}
	
	
}