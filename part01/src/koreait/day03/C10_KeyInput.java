package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {
	public static void main(String[] args) {
		// sc�� �������Դϴ�. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� �����Դϴ�. -> ������ ����
		// �� new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ���� �����մϴ�.
		Scanner sc = new Scanner(System.in);
		// Ű���� �Է��� ���� ���� ����. - ǥ���Է����� Scanner ��ü�� ����� ���� sc�� �����մϴ�.
		
		int data;
		
		System.out.print("������ �Է��ϼ���. -> "); // �Է� �ȳ� �޼���
		data = sc.nextInt(); // ����ڷκ��� Ű���� �Է¹ް� �� ���� ������ ��ȯ�Ͽ� data ������ ����.
		System.out.println("�Էµ� ���� " + data + "�Դϴ�."); // ����ڰ� ���ڸ� �Է����� �ʾ������� ������ ��ȯ���� ���ϰ� ���� �߻���Ų��.
		
		double point;
		System.out.print("�Ǽ��� �Է��ϼ���. -> ");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + " �Դϴ�");
	}
}

/*
 * 	ǥ�� ��� : System.out (out�� System Ŭ������ ������ �ʵ��̰� �޼ҵ� println()�� �����ϴ�.)
 *  ǥ�� �Է� : System.in	   -> in�� System Ŭ������ ������ �ʵ�
 *  					   -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 						   -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 * 						*���� : �⺻��Ű�� java.lang�� import ���� ����մϴ�.
 * 
 * ���� : import ����Ű�� ctrl + shift + o
 */