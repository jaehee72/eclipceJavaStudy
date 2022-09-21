package ch04.ex02.Quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("월 입력 : ");
		int num = sc.nextInt();

		if(num == 0)
			System.out.println("해당 일은 존재하지 않습니다.");
		else if (num == 2)
			System.out.println("2월은 28일까지입니다.");
		else if (num == 8)
			System.out.println("8월은 31일까지입니다.");
		else if (num<=12 && num%2 == 0)
			System.out.printf("%d월은 30일까지입니다.", num);
		else if (num<=12 && num%2 == 1)
			System.out.printf("%d월은 31일까지입니다.", num);
		else
			System.out.printf("해당월은 존재하지 않습니다.");
		
//		switch (num) {
//		case 0:
//			System.out.println("해당 월은 존재하지 않습니다.");
//			break;
//		case 1:
//			System.out.println("1월은 31일까지입니다.");
//			break;
//		case 2:
//			System.out.println("2월은 28일까지입니다.");
//			break;
//		case 3:
//			System.out.println("3월은 31일까지입니다.");
//			break;
//		case 4:
//			System.out.println("4월은 30까지입니다.");
//			break;
//		case 5:
//			System.out.println("5월은 31일까지입니다.");
//			break;
//		case 6:
//			System.out.println("6월은 30일까지입니다.");
//			break;
//		case 7:
//			System.out.println("7월은 31일까지입니다.");
//			break;
//		case 8:
//			System.out.println("8월은 31일까지입니다.");
//			break;
//		case 9:
//			System.out.println("9월은 30일까지입니다.");
//			break;
//		case 10:
//			System.out.println("10월은 31일까지입니다.");
//			break;
//		case 11:
//			System.out.println("11월은 30일까지입니다.");
//			break;
//		case 12:
//			System.out.println("12월은 31일까지입니다.");
//			break;
//		default:
//			System.out.println("해당 월은 존재하지 않습니다.");
//			
//		
//		
//		
//		}
		
	}
	}

