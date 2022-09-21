package ch01.quiz02.case07;

import java.util.Scanner;

public class UserService {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		public int menu() {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("선택 : ");
			return sc.nextInt();
}
	public void input(UserChild2[] uc) {
		if (cnt == uc.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		}else {
			uc[cnt] = new UserChild2();
			System.out.println("아이디 입력 : ");
			uc[cnt].setId(sc.next());
			System.out.println("패스워드 입력: ");
			uc[cnt].setPwd(sc.next());
			System.out.println("이름 입력 : ");
			uc[cnt].setName(sc.next());
			System.out.println("이메일 입력: ");
			uc[cnt].setEmail(sc.next());
			System.out.println("나이 입력: ");
			uc[cnt].setAge(sc.nextInt());
			cnt++;
		}
		}
	
	public void output(UserChild2[] uc) {
		if(cnt ==0) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i =0; i<cnt;i++) {
				System.out.println(uc[i].getId());
				System.out.println(uc[i].getPwd());
				System.out.println(uc[i].getName());
				System.out.println(uc[i].getEmail());
				System.out.println(uc[i].getAge());
				
			}
		}
	}
}
	