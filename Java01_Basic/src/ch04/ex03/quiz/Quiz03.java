package ch04.ex03.quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for(;;) {
			
			System.out.println("단 입력 : ");
			int dan = sc.nextInt();
			
			// 2~9단까지 출력
			for (int i =1; i<10; i++) {
				if (dan >= 2 && dan<=9) {
					System.out.println(dan + " * "+ i + " = " + dan*i);
				} else if(dan==10){
					System.out.println("종료");
					return;
					//System.exit(0)
					
				} else {
					System.out.println("출력할 수 없는 단");
					break;
				}
			}
		}
		
		
	}

}
