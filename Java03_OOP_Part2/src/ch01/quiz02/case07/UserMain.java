package ch01.quiz02.case07;


public class UserMain {

	public static void main(String[] args) {
		UserService ss = new UserService();
		UserChild2 [] uc = new UserChild2[3]; 
		
	while(true) {
	int menu = ss.menu();
	
	switch(menu) {
	case 1:
		ss.input(uc);
		break;
	case 2:
		ss.output(uc);
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
