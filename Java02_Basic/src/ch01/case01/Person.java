package ch01.case01;

public class Person {
	String name;
	int age;
	@Override
	public String toString() { // object 클래스 자동 상속되어잇음
		return String.format("이름 : %s 나이: %d", name, age);
}
}