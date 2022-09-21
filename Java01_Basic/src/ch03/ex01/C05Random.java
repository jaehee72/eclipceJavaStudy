package ch03.ex01;

public class C05Random {

	public static void main(String[] args) {

		//Math.random() 사용해 1이상 10이하의 정수값 출력
		
//		double d = Math.random();
//		System.out.println(d);
		
		int f = (int) (Math.random() * 10) +1 ;
		System.out.println(f);
		
	}

}
