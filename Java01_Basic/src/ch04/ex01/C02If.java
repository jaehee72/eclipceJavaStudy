package ch04.ex01;

public class C02If {

	public static void main(String[] args) {
		
		int visitCnt = 0;
		
		if (visitCnt <1) {
			System.err.println("첫방문");
			visitCnt++;
			return;
		}
		if (visitCnt>=1) {
			System.out.println("재방문");
		}
	}
}
