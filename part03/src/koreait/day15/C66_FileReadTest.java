package koreait.day15;

import java.io.File; // io : input, output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C66_FileReadTest {
	public static void main(String[] args) {
		
//		String filename = "C:\\0524_java_LBG\\�ڹ��׽�Ʈ.txt";
		String filename = "C:\\0524_java_LBG\\�ڹ��׽�Ʈ2.txt";
		
		File file = new File(filename);
		
		// Scanner : �Է� ����� ���� Ŭ����
		// Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~ catch �ʿ��ϴ�.
		Scanner sc = null;
		try {
			sc = new Scanner(file); // System.in : ǥ�� �Է�(�ܼ� �Է�)
			
//			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
//			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
//			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			// �Է� ��ɿ��� ������ ������ Exception �� �߻��մϴ�.
			e.printStackTrace();
			System.out.println("����� ���� �߻� : " + e.getMessage());
		} finally {
			if(sc != null) sc.close();
		}
		
	}
}

// try ~ catch �ڿ����� ����� finally �Ⱦ��� java 7 ���� ���� �ٸ� ���� ������ �����մϴ�.
// �� ���õ� �������̽��� ���������� ã�ƺ��� try with resource

