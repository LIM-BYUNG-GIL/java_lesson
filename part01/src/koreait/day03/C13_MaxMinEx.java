package koreait.day03;
// �ۼ��� : �Ӻ���
import java.util.Scanner;

public class C13_MaxMinEx {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n1;
	int n2;
	int n3;
	int max;
	int min;
	
	System.out.print("n1�� ���� �Է��ϼ��� : ");
	n1 = sc.nextInt();
	System.out.print("n2�� ���� �Է��ϼ��� : ");
	n2 = sc.nextInt();
	System.out.print("n3�� ���� �Է��ϼ��� : ");
	n3 = sc.nextInt();
	
	if(n1 > n2) {
		max = n1;
	}else {
		max = n2;
	}
	
	if(max < n3) {
		max = n3;
	}
	
	System.out.println("max���� : " + max + " �Դϴ�");

	if(n1 > n2) {
		min = n2;
	}else {
		min = n1;
	}
	
	if(min > n3) {
		min = n3;
	}
	
	System.out.println("min���� : " + min + " �Դϴ�");
	
	}
}
