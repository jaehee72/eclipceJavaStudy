package ch04.ex02.Quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("가위 바위 보를 해봐요!");
		System.out.println("1. 가위 2. 바위 3.보");
		System.out.print(">");
		String J = "";
		String N = "";
		int me = sc.nextInt();
		int app= (int) (Math.random()*3)+1;
		
		
		switch(me){
			case 1: J = "가위"; 
			break;
			case 2: J = "바위";
			break;
			case 3: J = "보";
			break;
			default : J = "에러입니다.";

		}
		switch(app){
		case 1: N = "가위"; 
		break;
		case 2: N = "바위";
		break;
		case 3: N = "보";
		break;
		default : N = "에러입니다.";
	}

		System.out.println("You : "+ J);
		System.out.println("App : "+ N);
		
		if(J == "가위")
			if(N =="보")
			System.out.println("You win!");
			else if(N =="바위")
				System.out.println("You Lose...");
			else if(N =="가위")
				System.out.println("Draw");
			else
				System.out.println("Error");
		else if(J =="바위")
			if(N =="보")
				System.out.println("You Lose...");
			else if(N =="바위")
				System.out.println("Draw");
			else if(N =="가위")
				System.out.println("You win!");
			else
			System.out.println("Error");
		else if(J =="보")
			if(N =="보")
			System.out.println("Draw!");
			else if(N =="바위")
				System.out.println("You win!");
			else if(N =="가위")
				System.out.println("You Lose...");
			else
				System.out.println("Error");
		else
			System.out.println("Error");
		
	}

}
