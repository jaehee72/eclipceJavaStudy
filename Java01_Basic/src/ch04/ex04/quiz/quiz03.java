package ch04.ex04.quiz;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		int random = 1;

		while((sum<30000)) {

			random = (int)(Math.random()*10000)+1000;
			cnt ++;
			sum = sum+ random;
			System.out.printf("%d번째 %d원 \n", cnt, random);

		}
			System.out.printf("지갑에서 %d번에 걸쳐 총 %d원을 꺼냈습니다.", cnt, sum);
		
	}

}
