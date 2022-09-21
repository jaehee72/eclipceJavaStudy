package ch05.quiz;

public class quiz06 {

	public static void main(String[] args) {
		
//		char a = 'A';
//		System.out.println(a++);
//		System.out.println(++a);
		
		char [] alphabets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++; //a[0]=65저장, a[i]=66
		}
		for(int i = 0; i <alphabets.length; i++) {
			System.out.println(alphabets[i] + ","+ (int)alphabets[i]);
		}

		for(char alpha : alphabets)
			System.out.println(alpha + "," + (int)alpha);
	}

}
