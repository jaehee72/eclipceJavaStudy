package ch02.ex01.case04;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
