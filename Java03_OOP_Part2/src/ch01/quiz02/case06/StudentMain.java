package ch01.quiz02.case06;

public class StudentMain {
	public static void main(String[] args) {
		StudentService ss = new StudentService();
		StudentChild[] student = new StudentChild[3];
		
		while(true) {
		int menu = ss.menu();
		
		switch(menu) {
		case 1:
			ss.input(student);
			break;
		case 2:
			ss.output(student);
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
