package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String best; // Ư�� ����� ������ ����
		int kor;
		int eng;
		int sci;
		int count = 3;
		int bestScore;
		final String korean = "����";
		final String english = "����";
		final String science = "����";
		
		System.out.println("[[���� ���� :  ���, ����, Ư����� ���ϱ�]]");
		System.out.println("������ �Է��ϼ���.");
		System.out.print("���� -> ");
		kor = sc.nextInt();
		System.out.print("���� -> ");
		eng = sc.nextInt();
		System.out.print("���� -> ");
		sci = sc.nextInt();
		
		System.out.println(">> ó���Ǿ����ϴ�.");
		System.out.println("���� : " + (kor + eng + sci));
		System.out.printf("��� : %d (%.2f), ����� : %d\n", (kor + eng + sci) / count, (kor + eng + sci) / (double)count, count);
		
		if(kor > eng) {
			best = korean;
			bestScore = kor;
		}
		else {
			best = english;
			bestScore =eng;
		}
		
		if(bestScore < sci) best = science;
		
		System.out.printf("�� �л��� Ư�� ������ . %s . �Դϴ�.", best);
	}
}
