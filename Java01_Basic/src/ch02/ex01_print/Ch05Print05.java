package ch02.ex01_print;

public class Ch05Print05 {

	public static void main(String[] args) {

		
		
		// 문자열 + 문자열
		System.out.println("Hello"+ "World");
		// 문자열 + 정수
		System.out.println("Hello"+ 100);
		// 정수+ 정수+ 문자열
		System.out.println(100 + 200 + "hello"); // "300"+ "hello"
		System.out.println("hello"+100+200); //hello100200
		System.out.println("hell0"+(100+200));
		System.out.println(100+""+200+"hello"); //100200hello
	}

}
