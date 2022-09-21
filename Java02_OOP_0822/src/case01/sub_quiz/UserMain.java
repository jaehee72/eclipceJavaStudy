package case01.sub_quiz;

public class UserMain {
	public static void main(String[] args) {
		
		User[] user = new User[5];
		UserService us = new UserService();
		
		while(true) {
			int menu = us.menu();
			switch(menu) {
			case 1:
				us.signUp(user);
				break;
			case 2:
				us.login(user);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
		
	}
	
}
