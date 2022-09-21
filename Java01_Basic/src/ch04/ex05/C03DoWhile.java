package ch04.ex05;

import java.util.Scanner;

public class C03DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		String errMsg = "한자리 자연수를 입력하세요. "; 
		boolean isOne = false;
		
		do {
			System.out.println("입력 : ");
			input = sc.nextLine();
			
			if(input.length()==1 && input.charAt(0)>'0' && input.charAt(0)<='9') {
				isOne = true;} 
	
			else {
				System.out.println(errMsg);
			}
		}while(!isOne);
		System.out.println("끝");
	}

}
