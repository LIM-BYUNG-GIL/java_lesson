package koreait.day02;

public class C08_Test {
	public static void main(String[] args) {
		int x = 23;
		int y = 19;
		double r = 23.23;
		int sw = x * y;
		double cw = 3.14 * r * r;
		double cl = 2 * 3.14 * r;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println("���� : " + x + " ��");
		System.out.println("���� : " + y + " ��");
		System.out.println("���̸� ���߽��ϴ�. -> " + sw + " ��");
		System.out.println();
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.printf("������ : %.3f �� \n", r);
		System.out.printf("�ѷ��� ���߽��ϴ�. -> %.3f �� \n", cl);
		System.out.printf("���̸� ���߽��ϴ�. -> %.3f �� \n", cw);
		
		// final �׽�Ʈ
		// 		 �������� �տ� final(������) Ű���带 ���̸� ���� �������� ���մϴ�.
		
		final int test = 123; // ���� ���� ���ϴ� ����Դϴ�.
		System.out.println("test = " + test);
		
//		test = 456; ����
		
		
		
		
		}
}
