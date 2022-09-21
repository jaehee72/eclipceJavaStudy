package ch01.ex01.quiz.sub;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02DateTime {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2020, 7, 22);
		LocalTime time = LocalTime.of(9, 32, 30);
		
		System.out.println(date);
		System.out.println(time);
	}
}
