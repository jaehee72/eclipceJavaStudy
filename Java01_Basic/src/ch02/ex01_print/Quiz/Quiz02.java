package ch02.ex01_print.Quiz;

public class Quiz02 {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 3;
		int tmp = 0; // 빈 상자
		System.out.printf("a : %d, b: %d", num1, num2);

		tmp = num1; // tmp =1
		num1 = num2; // a=3
		num2 = tmp; // b=1
		
		System.out.printf("a : %d, b: %d", num1, num2);
		System.out.println();}

}
