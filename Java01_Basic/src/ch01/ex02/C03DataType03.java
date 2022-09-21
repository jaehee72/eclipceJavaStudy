package ch01.ex02;

public class C03DataType03 {

	public static void main(String[] args) {
		
		
//		문자 타입과 리터럴
		char c1 = '가';      // 단일문자
		char c2 = 0xAc00;   // 유니코드 (16진수)
		char c3 = 44032;    //유니코드(10진수)
	    char c4 = '\uAC00'; //유니코드(문자)
	    
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(c3);
	    System.out.println(c4);
	    
	    //유니코드 인코딩
	    int i1 = '가'; //'가'(문자) --> 44032(숫자)
	    int i2 = '\uAC00';	//\uAC00 (유니코드문자) --> 44032(숫자)
	    System.out.println(i1);
	    System.out.println(i2);	    
	    
	}

}
