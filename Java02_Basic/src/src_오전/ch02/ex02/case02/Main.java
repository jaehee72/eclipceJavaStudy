package ch02.ex02.case02;

public class Main {
	public static void main(String[] args) {
		
		Farmer farmer = new Farmer();		 // 농부
		Retailer retailer = new Retailer();  // 유통업자
		
		Apple apple = retailer.sell(farmer.sell(1000));
		
		System.out.println(apple.getPrice());
	}
}
