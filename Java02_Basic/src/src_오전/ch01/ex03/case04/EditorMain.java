package ch01.ex03.case04;

public class EditorMain {
	public static void main(String[] args) {
		
		Editor report = new Editor();		
		String builder = report.getReport();
		
		System.out.println(builder);
	}
}
