// 정보 은닉(Information Hiding)
// 캡슐화(Encapsulation)
package ch01.ex03.case04;

public class Editor {
	// 필드
	private String title = "   이름\t     주소\t\t     전화번호\n";
	private String line = "===========================================\n";
	
	StringBuffer buffer = new StringBuffer();
	
	// 메소드
	private void makeHeader() {
		buffer.append(title);
		buffer.append(line);
	}
	
	private void makeBody() {
		buffer.append(" So-en\t");
		buffer.append(" Busan Korea\t");
		buffer.append(" 010-2222-3333\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
		buffer.append("\t\t\t 작성일: 8.18(목)");
	}
	
	public String getReport() {
		makeHeader();
		makeBody();
		makeFooter();
		
		return buffer.toString();
	}
}
