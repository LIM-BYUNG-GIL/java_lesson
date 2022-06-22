package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;

// C43�� ���� ����Ʈ�� �����ϱ�
// �ۼ��� : �Ӻ���
public class C48_MathList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = 5; // ���� ����
		
		ArrayList<MathProblem> problems = new ArrayList<>();
		
		int ans;
		int cnt = 0;
		System.out.println("-----------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-----------------------------------------------");
		System.out.println("�����մϴ�.");
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb(); // n1, n2 ���� ��ü�� �ʵ�� ���� ����.
			
			System.out.print("���� " + (i + 1) + ". " + temp.problem() + " �� �Է� -> ");
			ans =sc.nextInt();
			
			if(ans == temp.showAnswer()) { // ����� ��. ���� ���� count
				cnt++;
				temp.setCorrect(true);
			}
			problems.add(temp);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("ä�� �մϴ�. ���� ���� " + cnt + " (" + (cnt * 100 / size) + " ��)"); // 100 / size �� 1������ ����
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");
		
		
		
		for(int i = 0; i < problems.size(); i++)
		if(!problems.get(i).isCorrect())
		System.out.println("���� " + (i + 1) + ". " + problems.get(i).problem() + problems.get(i).showAnswer());
		
		sc.close();
		
	}
} // ����Ʈ�� �޼ҵ� 1) add 2) get 3) remove 4) size
