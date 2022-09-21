package ch02.ex02_input.Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz01 {

	public static void main(String[] args) throws IOException {

		System.out.printf("입력 : ");
		char x = (char) System.in.read();
		
		System.out.println("입력 받은 값: "+ x);
		
		
	}

}

