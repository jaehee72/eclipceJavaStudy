package ch03.ex03.case01;

public class Main {

	public static void main(String[] args) {

		AppleCar ac = new AppleCar();
		GoogleCar gc = new GoogleCar();
		
		MyCar car = new MyCar(gc); //DI
		
		car.start();
		car.stop();
		car.klaxon();
		
	}

}
