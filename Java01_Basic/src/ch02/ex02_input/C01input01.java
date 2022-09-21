package ch02.ex02_input;

import java.io.IOException;

public class C01input01 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("입력: ");
		
		//System.in.read()
		int x = System.in.read(); // 한 글자. 한 바이트식 입력된 값을 읽어들이는 메소드
		System.out.println("입력 받은 값(ASCII)"+ x);
		System.out.println("변환 시킨 값 : "+ (char)x);
	}

}
