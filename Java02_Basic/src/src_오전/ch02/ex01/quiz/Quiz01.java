package ch02.ex01.quiz;

public class Quiz01 {
	
	int a, b, c, d;
	
	public Quiz01() {
		a=10; b=20; c=30; d=40;
	}
	
	public Quiz01(int a) {
		this();
		this.a = a;
	}
	
	public Quiz01(int a, int b) {
		this(a);
		this.b = b;
	}
}
