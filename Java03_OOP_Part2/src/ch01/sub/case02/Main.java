package ch01.sub.case02;

public class Main {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.output();
		
		Parent p = new Parent();
		p.output();		
		
	}
	void output(int a) {
		System.out.println("a: "+a);
	}
	void output(String a) {
		
	}
	void output(int a, int b) {
		
	}
	

}
