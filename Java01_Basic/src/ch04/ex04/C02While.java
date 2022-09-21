package ch04.ex04;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		// 1. 조건에 true 값 넣기
		while(true) {
			System.out.println("a");
			// break;  반복문만 종료
			//return; //메소드 자체 종료 밑에 int i = 0; 이라고해도 작동 X
			// System.exit();
			break;
		}		
		
		// 2. boolean 타입
		boolean b1 = true;
		int i = 0;
		while(b1) {
			System.out.println("b");
			i++;
			if( i == 5)
				b1 = false;
	}
		
		// 3. 특정 조건을 종료 조건
		while (!(i==10)) {
			i++;
			System.out.print("c");
		}
		i=0;
		
		Scanner sc = new Scanner(System.in);
		while (!(i==10)) {
			System.out.print("입력 :");
			i = sc.nextInt();
		}		
		
	}
}
