package ch01.ex03.quiz;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Stationery> bag= new ArrayList<>();
		bag.add(new Eraser());
		bag.add(new Pencil());
	
	for(Stationery s: bag) {
		if(s instanceof Eraser) ((Eraser)s).erase();
		if(s instanceof Pencil) ((Pencil)s).write();
	}
}
}