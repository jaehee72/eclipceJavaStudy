package ch04.ex02.Quiz;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("정수 입력 ");
		int num = sc.nextInt();
		
		// if문
		if (num%2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		//Switch문 : 변수 또는 연산자/값
		switch (num%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
		}
		
	}

}
