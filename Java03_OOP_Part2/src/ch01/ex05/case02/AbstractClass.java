package ch01.ex05.case02;

public abstract class AbstractClass {
	abstract String run();	 //추상 메소드
	public String make() {
		return "";
	}
}
//	추상메소드를 하나라도 가지면, 추상클래스가 된다.(must)