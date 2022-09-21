package ch02.quiz.quiz_sub;

import java.util.Scanner;

public class MainService {
	
	Scanner sc = new Scanner(System.in);
	ScoreService ss= new ScoreService();
	ProfessorService ps = new ProfessorService();
	
	
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("선택 : ");
		return sc.nextInt();
	} 
	
	public void input(Score[] s, Professor[] p){
		System.out.println("1. 학생 입력");
		System.out.println("2. 교수 입력");
		System.out.println(">> ");
		int num = sc.nextInt();
		
		if(num==1) {
			ss.input(s);
		}else if(num==2) {
			ps.input(p);
		}
		
	}
	
	public void output(Score[] s, Professor[] p) {
		System.out.println("1. 학생 출력");
		System.out.println("2. 교수 출력");
		System.out.println(">> ");
		int num = sc.nextInt();
		
		if(num==1) {
			ss.output(s);
		}else if(num==2) {
			ps.output(p);
		}
	}
	public void modify(Score[] s, Professor[] p) {
		System.out.println("1. 학생 수정");
		System.out.println("2. 교수 수정");
		System.out.println(">> ");
		int num = sc.nextInt();
		
		if(num==1) {
			ss.modify(s);
		}else if(num==2) {
			ps.modify(p);
		}
	}
	
	public void delete(Score[] s, Professor[] p) {
		System.out.println("1. 학생 삭제");
		System.out.println("2. 교수 삭제");
		System.out.println(">> ");
		int num = sc.nextInt();
		
		if(num==1) {
			ss.delete(s);
		}else if(num==2) {
			ps.delete(p);
		}
	}
}
