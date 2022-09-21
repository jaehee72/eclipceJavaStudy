package ch01.ex01.quiz.case01;

public class PersonTest {
	public static void main(String[] args) {
		
		Person personT = new Person();
		
		personT.name = "Tomy";
		personT.age = 30;
		personT.height = 170;
		personT.weight = 65;
		personT.gender = "남성";
		
		personT.showPersonInfo();
	}
}
