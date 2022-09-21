package ch03.ex03.Quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요.: ");
		int x = sc.nextInt();
		System.out.println("두번째 수를 입력하세요.: ");
		int y = sc.nextInt();
		
		System.out.println("x : "+ x);
		System.out.println("x : "+ y);
		int result = (x>=0? x: -x);
		int result1 = (y>=0? y: -y);
		
		System.out.println("X의 절대값 : "+ result);
		System.out.println("Y의 절대값 : "+ result1);
		
		
		}

}
