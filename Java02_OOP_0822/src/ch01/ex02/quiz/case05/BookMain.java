package ch01.ex02.quiz.case05;

public class BookMain {
	public static void main(String[] args) {
		
		BookService bs = new BookService();
		Book[] b = new Book[bs.size()];
		
		while(true) {
			int menu = bs.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				bs.input(b);
				break;
			case 2:
				bs.output(b);
				break;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
