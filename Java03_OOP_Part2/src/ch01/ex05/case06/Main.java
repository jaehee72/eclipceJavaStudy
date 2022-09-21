package ch01.ex05.case06;

public class Main {

	public static void main(String[] args) {
		Car aCar = new AutomousCar();
		aCar.run();
		System.out.println("=========================");
		
		Car mCar = new ManualCar();
		mCar.run();
	}

	/*
	 * 템플릿 메소드
	 * - 추상 메소드나 구현된 메소드를 활용해서 코드의 흐름(시나리오)를 정의하는 메소드
	 * - 프레임워크에서 많이 사용되는 설계 패턴
	 * -추상 클래스로 선언된 상위 클래스에서 템플릿 메소드를 활용하여 전체적인 흐름을 정의하고
	 * 하위클래스에서는 다르게 구현되어야하는 부분은 추상 메소드로 선언하여 하위 클래스에서 구현하도록 함.
	 * */

}
