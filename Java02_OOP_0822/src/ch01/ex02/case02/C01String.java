package ch01.ex02.case02;

public class C01String {
	public static void main(String[] args) {
		
		String s1 = "이";
		String s2 = "이";
		System.out.println(s1 == s2);  // true
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = new String("이");
		String s4 = new String("이");
		
		System.out.println(s3 == s4);  // false
		
		System.out.println(s3);
		System.out.println(s4);
		
		String s5 = "이";
		String s6 = new String("이");
		System.out.println(s5 == s6);  // false
		
		boolean b1 = s3.equals(s4);
		System.out.println(b1);  // true
		
		boolean b2 = s5.equals(s6);
		System.out.println(b2);  // true
	}
}
