package ch01.ex02.case04;

public class Animal {
	private String species;
	private String habitat;
	
	public Animal() {
		System.out.println("Animal() was called.");
		
	}
	public void showAnimalInfo() {
		System.out.println("이 메소드는 Animal클래스객체와 Anmial을 상속받은 클래스 객체가 사용가능합니다.");
	}
}
