package koreait.day05;

import java.util.Scanner;

/*
 * GUI : Graphic User Interface (����� ������ ������, �޴� ������� ó��)
 * CLI : Command Line Interface (����� ������ �ؽ�Ʈ�θ� ó��)
 */

public class C26_BankExam {
	
	// CLI ����� �޴� ������ while������ ����
	public static void main(String[] args) {
		
		//�������� : ���������� ����/���/�ܰ���ȸ ����
		Scanner sc = new Scanner(System.in);
		boolean run = true; // �ݺ��� ������ ����
		int sel; // ���� ���� ����
		int balance = 0; // �ܰ�(�ܾ�)
		
		while(run) {
			int money; // while�� ��������. �Աݾװ� ��ݾ� ����
			System.out.println("---------------------------------");
			System.out.println("1. ���� �� 2. ��� �� 3. �ܰ�Ȯ�� �� 4. ����");
			System.out.println("---------------------------------");
			System.out.print("�޴� ���� >>> ");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1: // ���� ó��(���� �ݾ� �Է� -> �ܾ׿� ���ϱ�)
				System.out.print("���ݾ� > ");
				money = sc.nextInt();
				balance += money;
				
				System.out.println("�������� �ܾ��� " + balance + "���Դϴ�.");
				break;
			case 2: // ��� ó��(��� �ݾ� �Է� -> �ܾ׺��� ���� ���� �� ó�� (�ܾ׿��� ����))
				System.out.println("��ݾ� > ");
				money = sc.nextInt();
				if(balance >= money) {
					balance -= money;
					System.out.println("�������� �ܾ��� " + balance + "���Դϴ�.");
				}else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				break;
			case 3: // �ܰ�(balance) ���
				System.out.print("���� �ܰ� : " + balance);
				System.out.println(); // �ٹٲ�
				break;
			case 4: // �ݺ� ����
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			default: // 1, 2, 3, 4 �� ������ ���� ��
				System.out.println("�߸��� �����Դϴ�. ���� 1 ~ 4�� �Է��ϼ���.");
			}
		}
	}
}