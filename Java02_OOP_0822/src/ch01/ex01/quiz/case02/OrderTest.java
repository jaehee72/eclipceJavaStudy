package ch01.ex01.quiz.case02;

import java.time.LocalDate;
import java.time.LocalTime;

public class OrderTest {
	public static void main(String[] args) {
		
		Order myOrder = new Order();
		
		myOrder.orderNumber = "1001";
		myOrder.customerPhone = "010-1111-2222";
		myOrder.customerAddress = "서울시 강남구 역삼동 111";
		myOrder.orderDate = LocalDate.now();
		myOrder.orderTime = LocalTime.now().withNano(0);
		myOrder.price = 35000;
		myOrder.menuId = "0003";
		
		myOrder.showOrderDetail();
	}
}
