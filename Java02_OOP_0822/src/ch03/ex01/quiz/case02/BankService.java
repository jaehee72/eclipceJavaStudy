package ch03.ex01.quiz.case02;

import java.util.Scanner;

public class BankService {
	
	static int cnt =0;
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("1. 계좌등록");
		System.out.println("2. 계좌출력");
		System.out.println("0. 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}
	public void input(Bank[] b) {
		if(cnt == b.length) {
			System.out.println("더 이상 등록할 수 없습니다.");
		}else {
			b[cnt] = new Bank();
			System.out.println("계좌 번호 입력");
			b[cnt].setAccountNum(sc.next());
			System.out.println("잔액 입력 : ");
			b[cnt].setBalance(sc.nextInt());
			System.out.println("이자율 입력 : ");
			b[cnt].setRate(sc.nextDouble());
			cnt++;
		}
	}
	
	public void output(Bank[ ]b ) {
		if (cnt ==0) {
			System.out.println("출력할 정보가 없습니다.");}
		else {
			for (int i = 0; i<cnt; i++) {
				System.out.println(b[i].toString());
			}
		}
	}
}
