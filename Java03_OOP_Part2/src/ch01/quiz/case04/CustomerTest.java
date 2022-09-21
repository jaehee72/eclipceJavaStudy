package ch01.quiz.case04;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> cList = new ArrayList<>();
		

		//업캐스팅 형변환		
		Customer cLee = new Customer(1001,"박재희");
		Customer cKim = new VIPCustomer(1002,"재히", 1234) ;
		Customer cHong = new GoldCustomer(1003, "홍진영");
		
		cList.add(cLee);
		cList.add(cKim);
		cList.add(cHong);
		
		System.out.println("===== 고객 정보 출력 =====");
		for (Customer c:cList) {
			System.out.println(c.showCustomerInfo());
		}
		System.out.println();
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for (Customer c : cList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName()+"님이 "+ cost + "원 지불하셨습니다.");
			System.out.println(c.getCustomerName()+"님의 현재 보너스 포인트는 "+c.bonusPoint);
		}
	}

}
