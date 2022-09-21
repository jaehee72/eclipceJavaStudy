package ch04.ex02.Quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		//월별 계절 구하기
		Scanner sc = new Scanner (System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		String season = "";

		if(3<= month && month<=5) 
			season = "봄";
		else if(6>=month && month>=8)
			season = "여름";

		else if(9>=month && month>=11)
			season = "가을";

		else if(12>=month && month>=2)
			season = "겨울";
		else
			season = "존재하지 않는 달";


		System.out.printf("%d월은 %s입니다.", month, season);
		
}
}