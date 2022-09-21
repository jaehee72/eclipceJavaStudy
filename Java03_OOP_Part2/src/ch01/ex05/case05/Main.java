package ch01.ex05.case05;

public class Main {

	public static void main(String[] args) {
		
//		Computer computer = new Computer();
		Computer desktop = new Desktop();
		desktop.show();
		desktop.getOnline();
		
		System.out.println();
		
		Computer myNB = new MyNotebook();
		myNB.getOnline(); //오버라이딩
		myNB.show();	  //상속(NoteBook)
		
		System.out.println();
		MyNotebook myNote = (MyNotebook) myNB; //down_casting
		myNote.getOnline();	//오버라이딩
		myNote.show();		//상속(Notebook)
		myNote.Dowebcam();
	}

}
