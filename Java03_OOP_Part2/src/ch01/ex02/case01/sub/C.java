package ch01.ex02.case01.sub;

import ch01.ex02.case01.A;


public class C extends A {
	public void test() {
		int x = 0;

//		x= a;
//		x = b; 	//protected
		x = c;
		x = d;
//		m1();
//		m2();
		m3();  //protected
		m4();
		
		
	}
}
