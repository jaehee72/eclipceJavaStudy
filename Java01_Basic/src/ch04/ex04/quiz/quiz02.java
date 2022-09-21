package ch04.ex04.quiz;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int sum = 0;
		int cnt = 0;
		System.out.print(" 정수 입력 :");
		i = sc.nextInt();
		while((i!=0)) {
			cnt += 1;
			sum+= i%10;
			i /=10;

		}
		System.out.println("자릿수 : "+cnt);
		System.out.println("총 합 : "+sum);
		
	}

}
