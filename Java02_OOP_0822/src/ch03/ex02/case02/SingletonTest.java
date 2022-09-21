package ch03.ex02.case02;

public class SingletonTest {
	public static void main(String[] args) {
		
		
		Singleton s1 = Singleton.getInstance();
		s1.count();
		
		Singleton s2 = Singleton.getInstance();
		s2.count();		
		
		Singleton s3 = Singleton.getInstance();
		s3.count();
		
		
		System.out.println(s3.getCount());
		System.out.println(s1.getCount());
		System.out.println(s2.getCount());
	}

}
