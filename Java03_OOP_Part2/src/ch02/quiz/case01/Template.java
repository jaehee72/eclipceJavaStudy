package ch02.quiz.case01;

import java.util.Scanner;

public abstract class Template {
	int cnt=0;
	Scanner sc = new Scanner(System.in);
	abstract void input(Object[] o);
	abstract void output(Object[] o);
	abstract void modify(Object[] o);
	abstract void delete(Object[] o);
	abstract int menu();
	
	
	
}
