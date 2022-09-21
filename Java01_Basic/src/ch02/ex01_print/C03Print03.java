package ch02.ex01_print;

public class C03Print03 {

	public static void main(String[] args) {

		
		// %자릿수 d - 자릿수 만큼 (오른쪽 정렬)
		System.out.printf("%5d", 10);
		System.out.println();
	
		// %-자릿수 d - 자릿수만큼 공간 가짐(왼쪽 정렬)
		System.out.printf("%-5d%d", 10, 10);
		System.out.println();
		
		//%0자릿수d - 빈 공간이 0으로 채워짐
		System.out.printf("%05d", 10);
		System.out.println();
		
		System.out.printf("%f\n", 1.23456789);
		
		//%전체 자릿수 .소수점 자릿수f
		System.out.printf("%10.2f\n", 1.23456789);
		
		//%.소수점 자릿수f
		System.out.printf("%.2f\n", 1.23456789);
		System.out.println();
		
	}

}
