package ch02.ex02_input.Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz02 {

	public static void main(String[] args) throws IOException {

		System.out.printf("본인의 이니셜을 입력하세요 : ");
		char x = (char) System.in.read();
		char y = (char) System.in.read();
		char z = (char) System.in.read();
		System.out.println("입력 받은 값: "+ x+y+z);
		
		
		
		
		//		BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("본인의 이니셜을 입력하세요: ");
//		String str = name.readLine();
//		System.out.println("문자열: "+ str);


	}
// 엔터는 입력을 종료하는 키, 엔터는 \r\n 이다. 
// 
}
