package ch03.ex02.Quiz;

public class CarFactoryTest {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		
		Car audi1 = factory.creatCar();
		Car audi2 = factory.creatCar();
		
		System.out.println(audi1.getCarNum());
		System.out.println(audi2.getCarNum());
	}
}
