package ch03.ex01.case01;

public interface Interface {

	
	// void play{} 인터페이스는 일반 메소드를 가질 수 없음. 추상 메소드만 가짐.
	abstract int getAge(); //추상 메소드
	void setAge(int num); //abstract 생략 가능. 컴파일러가 자동
}
