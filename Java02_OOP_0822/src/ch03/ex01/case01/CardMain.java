package ch03.ex01.case01;

public class CardMain {
	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.shape = "heart";
		c1.number = 7;
		c1.width = 5;
		c1.height = 10;
		System.out.println(c1.shape + ", " + c1.number);
		System.out.println(c1.width + ", " + c1.height);
		
		System.out.println();
		
		Card c2 = new Card();
		c2.shape = "spade";
		c2.number = 5;
		Card.width = 20;
		Card.height = 30;
		System.out.println(c2.shape + ", " + c2.number);
		System.out.println(c1.width + ", " + c1.height);
	}
}
