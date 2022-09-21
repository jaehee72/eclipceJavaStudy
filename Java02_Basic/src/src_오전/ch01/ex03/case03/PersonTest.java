package ch01.ex03.case03;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("이순신");
		p.setAge(39);
		
		System.out.printf("%s, %d", p.getName(), p.getAge());
	}
}
