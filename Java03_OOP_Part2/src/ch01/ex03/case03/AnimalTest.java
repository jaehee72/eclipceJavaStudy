package ch01.ex03.case03;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	public void eating() {}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void peckAt() {
		System.out.println("독수리가 모이를 쫍니다.");
	}
}

public class AnimalTest {
	
	public static void main(String[] args) {
	
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
	}
	public void testDownCasting(ArrayList<Animal> animalList) {
		for(int i =0; i<animalList.size();i++) {
			Animal animal = animalList.get(i);
		
			if(animal instanceof Human) {
				Human human = (Human) animal; //down-casting
				human.readBooks();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunt();
			}else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.peckAt();
			}
		else {
			System.out.println("Error");
		}
		}
	}
}
