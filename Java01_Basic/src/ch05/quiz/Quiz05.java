package ch05.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("인원 수 입력 : ");
		int num = sc.nextInt();
		
		String name[] = new String[num];
		int score[] = new int[num];
		int rank[] = new int[num];
		
		for(int i=0; i<num;i++) {
			System.out.println("이름 입력 : ");
			name[i] = sc.next();
			System.out.println("성적 입력 : ");
			score[i] = sc.nextInt();
			
			rank[i] =1;
			for(int j = 0;j<i;j++) {
				if(score[j]>score[i]) rank[i]++;
				if(score[j]<score[i]) rank[j]++;
			}
			
			
		}
		
		System.out.println("이름\t성적\t순위");
		for(int i=0; i<num;i++) {
			System.out.println(name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		
	}

}
