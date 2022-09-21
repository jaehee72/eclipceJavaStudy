package ch01.ex02.quiz.case01;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "김수현";
		p.age = 30;
		
		System.out.printf("이름: %s, 나이: %d\n", p.name, p.age);
		
		System.out.println(p);
	}
}
