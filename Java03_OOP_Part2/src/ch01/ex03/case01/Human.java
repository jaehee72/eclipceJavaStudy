package ch01.ex03.case01;

public class Human extends Animal{
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다." );
	}
	public void hunt() {
		System.out.println(" 사람이 책을 읽습니다.");
	}
}
