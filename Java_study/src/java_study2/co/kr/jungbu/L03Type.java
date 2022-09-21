package java_study2.co.kr.jungbu;

enum E{ //열거형(type) E
}
@FunctionalInterface //추상 메서드를 꼭 1개 정의해야한다.
interface C{ //type C
	void print(); //추상 메서드만 정의할 수 있다.
	//void printb();
}
abstract class B{ //type B
	abstract public void print(); //추상 메서드를 정의할수 있다. 
}
class A{ //A type 
	
}
public class L03Type {
	//static 필드 : jvm이 코드를 실행할때 static으로 정의된 변수를 메소드 영역에서 생성 (보통 상수를 선언)
	public static int I=13; //상수 : 메소드 영역에 저장되는 static 필드 (변하지 않는 정보)
	
	class InClass extends B{
		@Override
		public void print() {}
	}
	public static void main(String[] args) {
		final int I=13; //상수 : (지역에서 사용되는 바뀌지 않는 상수)
		System.out.println(Integer.MAX_VALUE);//static 필드로 정의된 상수 
		A a=new A();
		//B b=new B();
		//C c=new C();
		//인터페이스와 추상클래스는 추상메서드가 있기 때문에 객체로 생성할 수 없다. 
		B b=new B() { 
			//생성과 동시에 추상메서드를 구현하면 객체로 생성할 수 있다.
			//이때 이너 클래스가 생성되는데 숫자로 정의된 익명 클래스가 만들어진다. 
			@Override
			public void print() {}
		};
		C c=new C() {
			@Override
			public void print() {}
		};
		B b2=new L03Type().new InClass();
		
		C c2=()->{}; //인터페이스에 추상메서드가 1개 있을 경우 람다식으로 객체를 생성할 수 있다. (함수형 언어 방식)
	}
}



