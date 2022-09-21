package ch02.ex02.quiz.case01;

public class Worker {
	
	String workerName;
	int money;
	
	public Worker(String workerName, int money) {
		this.workerName = workerName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(5000);
		this.money -= 5000;
	}
	
	public void showWorkerInfo() {
		System.out.printf("%s님의 잔액은 %d원입니다.", workerName, money);
	}
}
