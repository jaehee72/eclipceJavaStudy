package ch01.ex01.quiz.case02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
	// 멤버 변수_필드
	String orderNumber;
	String customerPhone;
	String customerAddress;
	LocalDate orderDate;
	LocalTime orderTime;
	int price;
	String menuId;
	
	// 멤버 함수_메소드
	void showOrderDetail() {
		System.out.println("주문 접수 번호: " + orderNumber);
		System.out.println("주문 전화번호: " + customerPhone);
		System.out.println("주문 집주소: " + customerAddress);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴번호: " + menuId);
	}
}
