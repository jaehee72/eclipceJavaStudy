package ch02.ex02_input.Quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {

		System.out.print("이름 입력 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		
		System.out.println("이름: "+ name);
		System.out.println("총점: "+ sum);
		System.out.printf("평균: %.2f", avg);
	}

}







