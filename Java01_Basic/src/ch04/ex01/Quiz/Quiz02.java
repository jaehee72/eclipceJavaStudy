package ch04.ex01.Quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.   입력");
		System.out.println("2.   출력");
		System.out.println("3.   수정");
		System.out.println("4.   삭제");
		System.out.println("0.   프로그램 종료");

		System.out.print("> ");
		int x = sc.nextInt();
		if (x == 1){
			System.out.println("입력 페이지입니다.");
//			int b = sc.nextInt();
		}
		else if(x==2) {
			System.out.println("출력 페이지입니다.");
		}
		else if (x==3) {
			System.out.println("수정 페이지입니다. ");
		}
		else if(x==4) {
			System.out.println("삭제 페이지입니다. ");
		}
		else if(x==0) {
			System.out.println("프로그램을 종료합니다.");
		}
		else {
			System.out.println("없는 메뉴입니다.");
		}
	}

}
