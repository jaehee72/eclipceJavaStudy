package ch03.ex03.Quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요: ");
		int math = sc.nextInt();
		int score = kor+eng+math;
		double avg = (double) score/3;
		
		System.out.println("총 점 : "+ score);
		System.out.println("평 균 : "+ avg);
//		String result = score/3 >= 90? "A" : (score/3>=80?"B":(score/3>=70?"C":"D"));
		char result = avg >= 90? 'A' : (avg >=80?'B':(avg >=70?'C':'D'));
		
		System.out.println(result);
		
		
		
	}

}
