package ch04.ex03.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i =1; i<=num ; i++) {
			for(int j=1 ; j<=i ; j++){
				System.out.println(j+ " ");
			}
			System.out.println();
		}
		
	}

}
