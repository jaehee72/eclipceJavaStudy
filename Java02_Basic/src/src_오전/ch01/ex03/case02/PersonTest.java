package ch01.ex03.case02;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		
//		p.name = "동수";
//		p.age = "준석";
		
		p.setName("수정");
		p.setAge(20);
		
		System.out.printf("%s, %d", p.getName(), p.getAge());
	}
}
