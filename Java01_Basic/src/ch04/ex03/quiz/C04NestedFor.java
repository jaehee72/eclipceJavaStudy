package ch04.ex03.quiz;

public class C04NestedFor {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(" ---- 내부 for를 실행 ----");
			}
		}
	}

}
