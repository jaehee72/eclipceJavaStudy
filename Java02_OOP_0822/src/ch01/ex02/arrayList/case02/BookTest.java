package ch01.ex02.arrayList.case02;

public class BookTest {
	public static void main(String[] args) {
		
		Book[] library = new Book[3];
		
		library[0] = new Book("헤리포터1", "조앤");
		library[1] = new Book("헤리포터2", "조앤");
		library[2] = new Book("헤리포터3", "조앤");
				
		for (int i=0; i<library.length; i++) {
			library[i].showBookInfo();
			System.out.println(library[i]);
		}
	}
}
