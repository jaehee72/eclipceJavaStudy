package ch01.ex02.quiz.case06;

public class Test {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		// 삭제
		for (int i=2; i<a.length-1; i++) {
			a[i] = a[i+1];
		}
		
		// 삭제 반영 출력
		for (int i=0; i<a.length-1; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
