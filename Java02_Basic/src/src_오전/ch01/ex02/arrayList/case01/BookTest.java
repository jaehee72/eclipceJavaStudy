package ch01.ex02.arrayList.case01;

public class BookTest {
	public static void main(String[] args) {
		
		Book[] library = new Book[3];
		
		library[0] = new Book();
		library[1] = new Book();
		library[2] = new Book();
		
		library[0].title = "헤리포터1";
		library[0].author = "조앤";
		library[1].title = "헤리포터2";
		library[1].author = "조앤";
		library[2].title = "헤리포터3";
		library[2].author = "조앤";
		
		for (int i=0; i<library.length; i++) {
			library[i].showBookInfo();
			System.out.println(library[i]);
		}
	}
}
