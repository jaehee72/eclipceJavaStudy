package ch03.ex03.Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개를 입력하세요 : ");
		int a = sc.nextInt();
//		String result = "";
//		result = (a%2==0)? "짝수": "홀수";
		String result = (a%2==0)? "짝수": "홀수";
		System.out.printf("이것은 %s 입니다", result);

	}

}

