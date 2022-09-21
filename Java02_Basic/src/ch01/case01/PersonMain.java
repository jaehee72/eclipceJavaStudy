package ch01.case01;

import java.util.Scanner;

import ch01.ex01.Time;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		p.name = sc.next();
		System.out.println("나이 : ");
		p.age = sc.nextInt();
		
		System.out.println(p);
	}

}
