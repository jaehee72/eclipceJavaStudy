package ch02.ex01_print.Quiz;

public class Quiz01 {

	public static void main(String[] args) {

		
		int year = 2022;
		int month = 8;
		int day = 8;
		
		System.out.printf("%d년 %02d월 %02d일", year,month, day);
		System.out.println();

		
		System.out.printf("%02d월 %02d일",month, day);
		System.out.println();
		System.out.printf( "02%d일", day);
		
		
	}

}
