package ch02.ex02.quiz.case02;

public class Subway {
	
	int lineNum;
	int income;
	int passengerCnt;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		this.income += money;
		passengerCnt++;
	}

	public void showSubwayInfo() {
		System.out.printf("%d호선 지하철의 승객은 %d명이고, 수입은 %d원입니다.\n",
				lineNum, passengerCnt, income);
	}
}
