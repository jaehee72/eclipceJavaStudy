package ch04.ex01.Quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {

		System.out.print("이름 입력 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
//		System.out.println("이름 입력: "+name);
		System.out.println("### 출생 지역 선택 ###");
		System.out.println("1. 서울");
		System.out.println("2. 경기도권");
		System.out.println("3. 강원도권");
		System.out.println("4. 충청도권");
		System.out.println("5. 경상도권");
		System.out.println("6. 전라도권");
		System.out.println("7. 제주도권");
		
		System.out.print("출생 지역 선택: ");
		int x = sc.nextInt();
		
		if (x == 1){
			System.out.printf("%s님의 출생 지역은 서울입니다.",name);
		}
		else if(x==2) {
			System.out.printf("%s님의 출생 지역은 경기도권입니다.",name);
		}
		else if (x==3) {
			System.out.printf("%s님의 출생 지역은 강원도권입니다.",name);
		}
		else if(x==4) {
			System.out.printf("%s님의 출생 지역은 충청도권입니다.",name);
		}
		else if(x==5) {
			System.out.printf("%s님의 출생 지역은 경상도권입니다.",name);
		}else if(x==6) {
			System.out.printf("%s님의 출생 지역은 전라도권입니다.",name);
		}else if(x==7) {
			System.out.printf("%s님의 출생 지역은 제주도권입니다.",name);
		}
		else {
			System.out.println("없는 지역입니다.");
		}
	}
		
		
}