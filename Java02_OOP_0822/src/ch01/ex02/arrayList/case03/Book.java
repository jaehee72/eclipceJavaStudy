package ch01.ex02.arrayList.case03;

public class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	void showBookInfo() {
		System.out.println(title + ", " + author);
	}
}
