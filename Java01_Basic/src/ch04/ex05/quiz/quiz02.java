package ch04.ex05.quiz;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*10)+1;
		int i =0;
		int cnt = 0;
		
		do {
			System.out.print("입력 : \n");
		    i = sc.nextInt();
			cnt++;
			
			if(i > random) {
				System.out.println("더 큰 수를 말했군요");}
				else if(random>i){
				System.out.println("더 작은 수를 말했군요");	
				}
				else {
					
				}

		}while(i != random);
		System.out.println(cnt+"번 만에"+random+"을 맞추셨습니다.");
		
	}
}
