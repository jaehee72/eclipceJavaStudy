package ch05.quiz;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수를 입력 : ");
		int size = sc.nextInt();
		
		String name[] = new String[size];
		String phone[] = new String[size];
		
		for(int i =0;i<name.length;i++) {
			System.out.println("\n ###" + (i+1) + "###");
			System.out.println("이름을 입력하세요 : ");
			name[i] = sc.next();
			System.out.println("전화번호를 입력하세요: ");
			phone[i] = sc.next();

		}
		
		for(int i =0;i<name.length;i++) {
			System.out.println("\n ###" + (i+1) + "###");
			System.out.println("이름: " + name[i]);
			System.out.println("전화번호: "+phone[i]);
		}
		
		System.out.println();
		
		
		/// Enhanced for문 (자료 구조 알고리즘 _ for-each)
		for (String s : name) {
			System.out.print(s+ " ");
		}
		
	}

}
