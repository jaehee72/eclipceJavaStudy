package ch04.ex03.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		
		
		for(;;) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수력");
			System.out.println("4. 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("선택 : ");
			int num = sc.nextInt();
			boolean end = false;
			switch(num) {
			case 1:
				System.out.println("입력 페이지입니다.");
			case 2:
			System.out.println("출력 페이지입니다.");
			case 3:
				System.out.println("수정 페이지입니다.");
			case 4:
				System.out.println("삭제 페이지입니다.");
			case 0:
				System.out.println("프로그램 종료");
				//end = true;
				//break;
				//return;
				System.exit(0);
			default:
				System.out.println("없는 메뉴 번호입니다.");
			}
		if(end) {
			break;
		}
	}
	}
}


	