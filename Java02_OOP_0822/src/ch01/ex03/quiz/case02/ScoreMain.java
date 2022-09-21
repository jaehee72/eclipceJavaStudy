package ch01.ex03.quiz.case02;

public class ScoreMain {
	public static void main(String[] args) {
		
		ScoreService ss = new ScoreService();
		Score[] s = new Score[3];
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				ss.input(s);
				break;
			case 2:
				ss.output(s);
				break;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
