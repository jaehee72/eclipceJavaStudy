package ch01.ex05.case06;

public class AutomousCar extends Car{

	   @Override
	   public void drive() {
	      System.out.println("자율 주행을 합니다.");
	   }

	   @Override
	   public void stop() {
	      System.out.println("스스로 멈춥니다.");
	   }

	}