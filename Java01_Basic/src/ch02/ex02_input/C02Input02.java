package ch02.ex02_input;

import java.io.BufferedReader;			//ctrl+shift+o
import java.io.InputStreamReader;
import java.io.IOException;

public class C02Input02 {

	public static void main(String[] args) throws IOException {

		//문자열 입력 : BufferedReader, Scanner
		//자바에서 주로 입력 받을 때 쓰는 건 Scanner
//				String name = "dfddfdf"
		// 설계도면같은 느낌 class를 하나 만들면 이걸 가지고 똑같은 모양의 
		// 공장이나 설계도면으로 클래스를 비유하는데 
		// 100대 200대 300대 똑같은 차를 뽑아낼 수 있음
		// bufferedReader 설계도면 --> 똑같은 차를 수백대를 만들 수 있음 (객체를 만듬)
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력: ");
		String str = in.readLine();
		System.out.println("문자열: "+ str);
		
		
		
//		in.readLine();
		
		// BufferedReader : 설계도면
		// new BufferedReader : 만든 객체
		// BufferedReader 혼자로서는 x 보여지려면 객체가 만들어져야됨

	}

}
