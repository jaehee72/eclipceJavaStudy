package ch01.ex02.arrayList.case03;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("헤리포터1", "조앤"));
		library.add(new Book("헤리포터2", "조앤"));
		library.add(new Book("헤리포터3", "조앤"));
				
		for (int i=0; i<library.size(); i++) {
			library.get(i).showBookInfo();
		}
	}
}
