package ch01.quiz.case05;

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
		
//		System.out.println("===== 고객 정보 출력 =====");
//		for (Customer c:cList) {
//			System.out.println(c.showCustomerInfo());
//		}
//		System.out.println();
//		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
//		int price = 10000;
//		for (Customer c : cList) {
//			int cost = c.calcPrice(price);
//			System.out.println(c.getCustomerName()+"님이 "+ cost + "원 지불하셨습니다.");
//			System.out.println(c.getCustomerName()+"님의 현재 보너스 포인트는 "+c.bonusPoint);
//		}
		// 다운캐스팅(down_casting) 강제 타입 변환
//		VIPCustomer vc = (VIPCustomer) cHong; //compiler가 찾아내진 못했지만 실행 시 에러 발생. 즉 타입 변환 불가
		if (cHong instanceof VIPCustomer) { //왼쪽이 오른쪽 타입의 인스턴스(객체)였는지 확인해줌
			VIPCustomer vc =(VIPCustomer) cHong;
		}
		if (cHong instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer) cHong;      //down_casting
			System.out.println(cHong.showCustomerInfo());
		}
	
	
	
	
	
	}

}
