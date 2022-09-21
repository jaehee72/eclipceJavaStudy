package ch05.quiz;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int [5];
	/*	
		System.out.println("첫 번째 입력 : ");
		nums[0] = sc.nextInt();
		System.out.println("두 번째 입력 : ");
		nums[1] = sc.nextInt();
		System.out.println("세 번째 입력 : ");
		nums[2] = sc.nextInt();
		System.out.println("네 번째 입력 : ");
		nums[3] = sc.nextInt();
		System.out.println("다섯 번째 입력 : ");
		nums[4] = sc.nextInt();
		*/
		
		for (int i =0; i<5;i++) {
			System.out.print((i+1)+"번째 입력: ");
			nums[i] = sc.nextInt();
		}
		
		for (int i=0; i<5;i++) {
			System.out.println((i+1)+"번째 출력: "+nums[i]);
		}
		
		
		
//		System.out.println("첫번째 출력: "+nums[0]);
//		System.out.println("두번째 출력: "+nums[1]);
//		System.out.println("세번째 출력: "+nums[2]);
//		System.out.println("네번째 출력: "+nums[3]);
//		System.out.println("다섯번째 출력: "+nums[4]);
		
	}

}
