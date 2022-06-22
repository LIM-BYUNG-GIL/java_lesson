package koreait.day16;

import java.io.*;
import java.util.Scanner;

// Exception ó�� ����� ���� �޼ҵ忡�� ���ǵɶ� �ٸ� ��� :

public class C68_FileReadWrite{
	// main �޼��尡 throws Exception �Ѵٸ� jvm ���� �ѱ�ϴ�. ó�������� printStackTrace����� ����.
	public static void main(String[] args) {

		String filename = "C:\\0524_java_LBG\\�ڹ��׽�Ʈ0617.txt";
		try {
			fileWriter2(filename);
//			filename = "C:\\0524_java_LBG\\�ڹ��׽�Ʈ0618.txt"; // ���� ���� �׽�Ʈ��
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� ���� : " + e.getMessage());
			System.out.println("������ �����ϴ��� Ȯ���ϼ���.");
		}
		

	}

	// ��� 1 : Exception�� try ~ catch �� ����ó�� �մϴ�.
	public static void fileWriter(String filename) {

		File file = new File(filename);

		PrintWriter pw = null;
		// ������ �޼��� java.io.PrintWriter(File file) throws FileNotFoundException
		try {
			pw = new PrintWriter(file); // file �� ������ ��ġ�� ����� ���� ��ü
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); // System.out : ǥ�� ���(�ܼ� ���)
		} catch (FileNotFoundException e) {
			// ��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
			System.out.println("����� ���� �߻� : " + e.getMessage());
		} finally {
			pw.close();
		}

	}

	// ��� 2 : throws Ű����� �ش� Exception ó���� ȣ���� ��(���⼭�� main�޼���)���� �ѱ��. (���ѱ��)
	//        throws �ڿ� , �� �����ؼ� ���� ���� ������ �� �ֽ��ϴ�.
	//        Exception ó���ؾ� �� �޼ҵ尡 ���� ���ǵǰ� ���� �� �� ������ ��� ó���� �� �ֽ��ϴ�.
	public static void fileWriter2(String filename) throws FileNotFoundException {

		File file = new File(filename);

		PrintWriter pw = null;
			pw = new PrintWriter(file); // file �� ������ ��ġ�� ����� ���� ��ü
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); // System.out : ǥ�� ���(�ܼ� ���)
			pw.close();

	}
	
	public static void fileRead(String filename) throws FileNotFoundException {
		
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
