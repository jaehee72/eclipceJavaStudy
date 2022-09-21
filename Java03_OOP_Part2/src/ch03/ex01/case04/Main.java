package ch03.ex01.case04;

public class Main {
	public static void main(String[] args) {
		C c = new C();		//A타입, B타입, C타입 다 가능
		B b = c;			//up_casting
		A a = c;
		
		c = (C) a;			//down_casting
		c = (C) b;
	}
}
