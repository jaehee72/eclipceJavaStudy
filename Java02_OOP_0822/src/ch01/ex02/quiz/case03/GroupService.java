package ch01.ex02.quiz.case03;

import java.util.Scanner;

public class GroupService {
	
	Scanner sc = new Scanner(System.in);
	
	public int size() {
		System.out.print("입력할 그룹 수: ");
		int gCnt = sc.nextInt();
		return gCnt;
	}
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void input(Group g[], int cnt) {
		g[cnt] = new Group();
		g[cnt].input();
	}
}
