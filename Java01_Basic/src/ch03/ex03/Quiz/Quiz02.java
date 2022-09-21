package ch03.ex03.Quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하세요: ");
		int a = sc.nextInt();
		System.out.println("b를 입력하세요: ");
		int b = sc.nextInt();
		System.out.println("c를 입력하세요: ");
		int c = sc.nextInt();
		
		int result = ((a>b) &&(a>c))?a:(((b>c)&&(b>a)?b:c));
		System.out.println("가장 큰 수 : "+result);
		
	}

}
