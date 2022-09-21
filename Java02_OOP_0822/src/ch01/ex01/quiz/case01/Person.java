package ch01.ex01.quiz.case01;

public class Person {
	
	String name;
	int age;
	double height;
	double weight;
	String gender;
	
	void showPersonInfo() {
		System.out.printf("키가 %.1f이고, 몸무게가 %.1fkg인 %s이 있습니다.\n", height, weight, gender);
		System.out.printf("이름은 %s이고, 나이는 %d세입니다.", name, age);
	}
}
