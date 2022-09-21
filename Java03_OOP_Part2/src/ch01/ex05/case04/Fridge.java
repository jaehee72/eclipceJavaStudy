package ch01.ex05.case04;

public class Fridge extends Appliance {

	@Override
	public void Poweron() {
		System.out.println("냉장고의 전원을 켜다");
	}

	@Override
	public void Poweroff() {
		System.out.println("냉장고의 전원을 끄다");
	}
	
}
// 추상클래스의 추상메소드는 상속받은 자식 클래스에서 구현해야 한다.