package ch03.ex01.case02;

public class Fridge implements Appliance {
	@Override
	public void PowerOn() {
		System.out.println("냉장고를 켜다");
	}
	@Override
	public void PowerOff() {
		System.out.println("냉장고를 끄다");
	}
}
