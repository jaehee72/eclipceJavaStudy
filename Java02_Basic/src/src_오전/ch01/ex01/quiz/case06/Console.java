package ch01.ex01.quiz.case06;

import java.util.Scanner;

public class Console {

	public static char inYn(String msg) {
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;
		char choice = 0;
		
		do {
			System.out.print(msg + "(y/n)? ");
			String input = sc.nextLine();
			
			if (input.length() == 1) {
				choice = input.charAt(0);
				if (choice == 'Y' || choice == 'y') choice = 'y';
				else if (choice == 'N' || choice == 'n') choice = 'n';
			}
			isGood = (choice == 'y' || choice == 'n');
			
			if(!isGood) System.out.println("ERROR] y or n을 입력해야 합니다.");
		} while(!isGood);
		
		return choice;
	}	
}
