package ch02.ex01.case03;

public class Student {
	
	String name;
	int score;
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
		
		System.out.println("");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}
