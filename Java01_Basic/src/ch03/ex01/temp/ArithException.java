package ch03.ex01.temp;

public class ArithException {

	public static void main(String[] args) {
		
		try {
			System.out.println(5/0); //java.lang.ArithmeticException: / by zer
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("End");
		
	}

}
