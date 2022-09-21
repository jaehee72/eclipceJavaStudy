package ch01.quiz.case02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer cLee = new Customer(1001,"박재희");

		cLee.bonusPoint= 1000;
		
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer jSeo = new VIPCustomer(1002,"재히") ;
		
		jSeo.bonusPoint=2000;
		System.out.println(jSeo.showCustomerInfo());
	
		// 형 변환(하위 -> 상위_업캐스팅)
		Customer vc = new VIPCustomer(1234,"none");
//		vc. // 검색되는 걸 보면, Customer(부모)거만 사용할 수 있음
		
	}

}
