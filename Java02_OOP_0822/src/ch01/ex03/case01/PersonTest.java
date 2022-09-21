package ch01.ex03.case01;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "김석영";
		p.age = 20;
		
		p.setName("로제");
		p.setAge(10);
		
		System.out.printf("%s, %d\n", p.name, p.age);
		System.out.printf("%s, %d", p.getName(), p.getAge());
	}
}
