package ch01.quiz02.case02;

public class Apple extends Fruit{

	int price = 1500;
	int amount =50;
	
	@Override
	public void output() {
		System.out.println("가격: "+ price);
		System.out.println("수량 : "+ amount);
	}
}
