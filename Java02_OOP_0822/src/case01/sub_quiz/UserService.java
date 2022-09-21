package case01.sub_quiz;

import java.util.Scanner;

public class UserService {
	
	Scanner sc = new Scanner(System.in);
	static int cnt = 0;
	
	public int menu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("0. 프로그램 종료");
		System.out.println("선택 : ");
		return sc.nextInt();
	}

	public void signUp(User[] user) {
		if (cnt == user.length) {
			System.out.println("더 이상 회원가입을 할 수 없습니다.");
		} else {
			System.out.println("아이디 입력 : ");
			String id = sc.next();
			
			for (int i =0; i<cnt;i++) {
				if(id.equals(user[i].id)) {
				System.out.println("이미 존재하는 아이디입니다.");
				return;
			}
		}
		//일치하는 id가 없으므로 id 생성
		user[cnt] = new User();
		user[cnt].id = id;
		System.out.println("패스워드 입력 : ");
		user[cnt].pw = sc.next();
		cnt++;
		}
	}

	public void login(User[] user) {
		System.out.println("로그인 아이디 입력");
		String id = sc.next();
		System.out.println("로그인 패스워드 입력");
		String pw = sc.next();
		
		for (int i =0; i<cnt; i++) {
			if (id.equals(user[i].id)&&(pw.equals(user[i].pw))){
				System.out.println("로그인 성공!");
				System.out.println(id + "님 환영합니다.");
				break;
			}
			if(cnt-1 == i) { // 다 돌았는데도 break에 걸리지 않았다.
				System.out.println("로그인 실패!");
			}
		}
	}
}
