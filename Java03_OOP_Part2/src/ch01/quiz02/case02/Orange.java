package ch01.quiz02.case02;

public class Orange extends Fruit {
	int price =2000;
	int amount =20;
	
	@Override
	public void output() {
		System.out.println("가격: "+ price);
		System.out.println("수량 : "+ amount);
}
}
