package ch04.ex05;

import java.util.Scanner;

public class C02Dowhile {

	public static void main(String[] args) {
		
		//한 글자만 입력할 때까지 반복 X
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		do {

			System.out.println(">");
			input = sc.nextLine();
			
			len = input.length();
			System.out.println(len + "글자를 입력 했습니다.");

		}while(len ==0 || len > 1);
		System.out.println("끝");
		
		
		
	}

}
