package ch02.ex02_input;

import java.io.IOException;
import java.util.Scanner;

public class C05Input05 {

	public static void main(String[] args) throws IOException  {

		Scanner sc = new Scanner(System.in);
		System.out.print("주소 입력 : ");
		String address = sc.next();
		System.out.println("주소 : "+  address);
		
		sc.nextLine();

		System.out.print("주소 입력 : ");
		String address2 = sc.nextLine();
		System.out.println("주소 : "+  address2);
		

	}

}
