package koreait.day07;

import java.util.Random;
import java.util.Scanner;
// �ۼ��� �Ӻ���
public class C42_Day07Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[] answer = new int[10];
		int[] num1 = new int[10]; 
		int[] num2 = new int[10];
		int sum;
		int score = 0;
		int count = 0;
		
		
		System.out.println("---------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("---------------------------------");
		System.out.println("�����մϴ�");
		
		for(int i = 0; i < answer.length; i++) {
			num1[i] = r.nextInt(90) + 10;
			num2[i] = r.nextInt(90) + 10;
			sum = num1[i] + num2[i];
			System.out.print("���� " + (i + 1) + ". " + num1[i] + " + " + num2[i] + " = �� �Է� - > ");
			answer[i] = sc.nextInt();
			if(sum == answer[i]) {
				count++;
				score += 10;
			}
		}
		
		System.out.println("---------------------------------");
		System.out.println("ä���մϴ�. ���� ���� " + count + " ( " + score + " ��)");
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");
		
		for(int i = 0; i < answer.length; i++) {
			sum = num1[i] + num2[i];
			if(sum != answer[i]) {
				System.out.println("���� " + (i + 1) + ". " + num1[i] + " + " + num2[i] + " = " + sum);
			}
		}
		
		sc.close();
		
	}
}
