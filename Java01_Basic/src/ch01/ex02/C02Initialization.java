package ch01.ex02;

public class C02Initialization {

	public static void main(String[] args) {

		int salary;
		int basicPay = 6_000;
		int bonus = 5_000;
		
		salary = basicPay + bonus;
		
		System.out.println(salary); //ERROR
		// 초기화하지 않은 변수는 메모리에서 값을 읽을 수 없다. 
		
	}

}
