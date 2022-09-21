package ch04.ex05.quiz;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int sum =0;
		
		do {
			System.out.print("숫자1 입력 : ");
			a = sc.nextInt();
			System.out.print("숫자2 입력 : ");
			b = sc.nextInt();
			sum = a+b;
			System.out.printf("%d + %d = %d \n", a,b,sum);
			
		}while(sum !=0);
		System.out.println("합계가 0이므로 프로그램을 종료합니다.");
		
	}
	

}

