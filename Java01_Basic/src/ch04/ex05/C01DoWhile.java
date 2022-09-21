package ch04.ex05;

import java.util.Scanner;

public class C01DoWhile {

	public static void main(String[] args) {
		
		int i = 0;
		while(i > 0) { //조건이 false면 무조건 실행하지 X
			System.out.println("하이");
		}
		i = 0;
		do {
			System.out.println("하이");
		} while(i > 0);
		
		Scanner sc = new Scanner(System.in);
		int kor;

		do {
			System.out.print("국어 점수 입력 : ");
			kor = sc.nextInt();
		}while(kor<0||kor>100);


	}

}
