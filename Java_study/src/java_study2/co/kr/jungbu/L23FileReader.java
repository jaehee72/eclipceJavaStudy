package java_study2.co.kr.jungbu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L23FileReader {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./src/java_study2/co/kr/jungbu/L20InputOutputStream.java"); //문자열로 작성된 파일을 불러오는 객체
			BufferedReader br = new BufferedReader(fr);
				
		}{
			String line =null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		}
}
	
		
		//catch(FileNotfoundException e) {e.printStackTrace();}
		//자식이 예외보다 부모의 예외가 먼저 있으면 절대로 실행되지 않는다.(컴파일 오류)
		//Exception > IOException> FileNotFoundException

//		try {
//		fr=new FileReader("newFile.txt");
//		br= new BufferedReader(fr);
//		String line=null;
//		try {
//			while((line=br.readLine())!=null) {
//				System.out.println(line);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if(br!=null)
//				try {
//					br.close();
//				}catch(IOException e) {
//					e.printStackTrace();
//				}
//		}
//	}
//}
//}
