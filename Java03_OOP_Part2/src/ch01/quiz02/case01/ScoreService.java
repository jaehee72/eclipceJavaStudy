package ch01.quiz02.case01;

import java.util.Scanner;

public class ScoreService {

	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.println("선택 : ");
		return sc.nextInt();
	}

	public void input(ScoreChild[] score) {
		if (cnt == score.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		}else {
			score[cnt] = new ScoreChild();
			System.out.println("이름 입력: ");
			score[cnt].setName(sc.next());
			System.out.println("국어 점수 입력: ");
			score[cnt].setKr(sc.nextInt());
			System.out.println("영어 점수 입력: ");
			score[cnt].setEng(sc.nextInt());
			System.out.println("수학 점수 입력: ");
			score[cnt].setMath(sc.nextInt());
			System.out.println("음악 점수 입력: ");
			score[cnt].setMusic(sc.nextInt());
			System.out.println("체육 점수 입력: ");
			score[cnt].setGym(sc.nextInt());
			

			score[cnt].setSum();
			score[cnt].setAvg();
			cnt++;
		}
	}

	public void output(ScoreChild[] score) {
		if(cnt ==0) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i =0; i<cnt;i++) {
				System.out.println(score[i].toString());
				
			}
		}
		
	}

}
