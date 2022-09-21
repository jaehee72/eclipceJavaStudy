package ch03.ex01.Quiz;

import java.util.Scanner;


public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("자연수 a:");
		int  a = sc.nextInt();
		System.out.print("자연수 b: ");
		int  b = sc.nextInt();

		System.out.printf("두 자연수의 합은 : %d" ,a+b );

	}

}
