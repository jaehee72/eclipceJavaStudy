package ch02.ex02.case02;

public class Retailer {

	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2);  // 사과의 가격을 납품가의 2배로 만듦.
		
		return apple;
	}
}
