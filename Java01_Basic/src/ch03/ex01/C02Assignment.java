package ch03.ex01;

public class C02Assignment {

	public static void main(String[] args) {
		// 대입 연산자(=)
		// 오른쪽에 있는 식이나 값을 왼쪽의 변수에 저장
		int a = 1 , b=2;
		System.out.printf("a: %d, b: %d\n", a, b);
		a= b;
		System.out.printf("a: %d, b: %d\n", a, b);
		
		a = a+1;
		System.out.println(a); //3
		
		//복합 대입 연산자
		
		int i =3;
		i = i+2; //5
		System.out.println(i);
		i = i+2; //7
		System.out.println(i);
		i -= 2; // 5
		System.out.println(i);
		i*=2; // 10
		System.out.println(i);
		i /= 2; // 5
		System.out.println(i);
		i %=2; // 1
		
		System.out.println(i);
		
	}

}
