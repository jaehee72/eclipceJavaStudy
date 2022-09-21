package ch01.ex02.quiz.case01;

public class Person {
	
	String name;
	int age;
		
	@Override
	public String toString() {
		return String.format("이름: %s, 나이: %d\n", name, age);
	}
}
