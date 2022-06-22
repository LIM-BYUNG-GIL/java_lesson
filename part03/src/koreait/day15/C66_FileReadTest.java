package koreait.day15;

import java.io.File; // io : input, output 입출력 관련된 기능들의 클래스
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C66_FileReadTest {
	public static void main(String[] args) {
		
//		String filename = "C:\\0524_java_LBG\\자바테스트.txt";
		String filename = "C:\\0524_java_LBG\\자바테스트2.txt";
		
		File file = new File(filename);
		
		// Scanner : 입력 기능을 갖는 클래스
		// Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try ~ catch 필요하다.
		Scanner sc = null;
		try {
			sc = new Scanner(file); // System.in : 표준 입력(콘솔 입력)
			
//			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
//			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
//			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("파일 읽기가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// 입력 기능에는 파일이 없으면 Exception 이 발생합니다.
			e.printStackTrace();
			System.out.println("사용자 오류 발생 : " + e.getMessage());
		} finally {
			if(sc != null) sc.close();
		}
		
	}
}

// try ~ catch 자원해제 방법을 finally 안쓰고 java 7 버전 부터 다른 구문 형식이 가능합니다.
// ㄴ 관련된 인터페이스가 무엇인지도 찾아보기 try with resource

