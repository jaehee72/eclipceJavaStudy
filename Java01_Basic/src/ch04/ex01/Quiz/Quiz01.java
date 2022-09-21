package ch04.ex01.Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("임의의 정수값을 입력하세요 : ");
		int x = sc.nextInt();

		if(x%2==0){
			System.out.printf("%d는 짝수입니다",x);
//			System.out.println("짝수입니다.");
		}
		else {
			System.out.printf("%d는 홀수입니다",x);
//			System.out.println("홀수입니다.");
		}
	}

}
