//package ch04.ex04.quiz;
//
//import java.util.Scanner;
//
//public class quiz04 {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//
//		String input ="";
//		boolean isGood =false;
//		int a = 0;				//숫자1
//		int b = 0;				//숫자2
//		char op = 0;			//사칙 연산자
//		int result = 0;			//처리 결과
//		char isRepeat = 0;		// y/n
//		
//		//입력
//		do{
//			System.out.println("숫자1: ");
//			input = sc.nextLine();
//			if(input.length ()==1 && input.charAt(0)>'0' && input.charAt(0)<='9') {
//				isGood = true;
//				a = Integer.parseInt(input);
//			}else {
//				isGood = false;
//				System.out.println("ERROR 한자리 정수를 입력하세요.");
//			}				
//			
//		}while(!isGood);
//		
//		do {
//			System.out.println("연산자 : ");
//			input = sc.nextLine();
//			if (input.length()==1) {
//				op = input.charAt(0);
//				if( op == '+' ||op == '-' ||op == '*' ||op == '/') isGood = true;
//				else isGood = false;
//				if(!isGood) System.out.println("[ERROR] , +, -, *, / 중에 입력하세요.");
//			}else {
//				isGood=false;
//				System.out.println("[ERROR] 아무것도 입력이 되지 않았습니다.");
//			}
//			
//		}while(!isGood);		
//		do{
//			System.out.println("숫자2: ");
//			input = sc.nextLine();
//			if(input.length ()==1 && input.charAt(0)>'0' && input.charAt(0)<='9') {
//				isGood = true;
//				a = Integer.parseInt(input);
//			}else {
//				isGood = false;
//				System.out.println("ERROR 한자리 정수를 입력하세요.");
//			}
//		}while(!isGood);
//		
//		//처리
//		switch(op) {
//		case '+': result = a+b;break;
//		case '-': result = a+b;break;
//		case '*': result = a+b;break;
//		case '/': result = a+b;break;
//		}
//		//출력
//		
//		System.out.println("%d %c %d = %d", a, op, b,result);
//
//		
//		do {
//			System.out.println("계속할까요?(y/n)");
//			input = sc.nextLine();
//			if(input.length()==1) {
//				isRepeat = input.charAt(0);
//					if(isRepeat =='Y'||isRepeat =='y'|| isRepeat=='N' || isRepeat=='n') isGood = true;
//					else isGood =false;
//			}else isGood =false;
//			if(!isGood) System.out.println("ERROR] y혹은 n을 입력하세요");
//		}while(!isGood);
//	}while (isRepeat == 'Y' || isRepeat == 'n')
//		System.out.println("끝");
//	}
//}
