package ch01.ex04.case01;

/*
 * Is -A관계 (상속, inheritance)
 * 상속은 클래스 간의 결합도가 높은 관계
 * 상윜르래스의 수정이 많은 하위클래스에 영향을 미칠 수 있음
 * 계층구조가 복잡하거나, 높으면 좋지않음.
 * 
 * */
public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(1,2,5);
		System.out.println(circle);
	}
}
