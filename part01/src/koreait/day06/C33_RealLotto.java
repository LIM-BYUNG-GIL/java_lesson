package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
	// �ۼ��� : �Ӻ���
	public static void main(String[] args) {
		int[] numbers = new int[45]; // ũ�Ⱑ 45�� numbers �迭 ����
		Random r = new Random(); // ���� �̱�
		
		for(int i = 0; i < 45; i++) { // �ε��� ���� : 0 ~ 44
			numbers[i] = i + 1; // �� ���� : 1 ~ 45
		}
		
		System.out.println("numbers �迭 �ʱⰪ --------------------------------");
		System.out.println(Arrays.toString(numbers)); // numbers �迭 �� ��Ÿ����
		System.out.println("------------------------------------------------");
		
		int[] lotto = new int[6]; // ũ�Ⱑ 6�� lotto �迭 ����
		int k; // ���� k ����
		for(int cnt = 0; cnt < 6; cnt++) { // for�� �ȿ� �������� cnt �����Ͽ� �ζ� ��ȣ 6�� �̱�
			
			k = r.nextInt(45 - cnt); // 1 ~ 45 ���ڸ� ���� ��ŭ �� ������ �ٿ����� ���� k �� �������� ����
			System.out.println("k = " + k + ", number = " + numbers[k]); // numbers �迭���� �������� ���� ���ڿ� ��ġ ���
			
			lotto[cnt] = numbers[k]; // �������� ���� ���� lotto �迭�� ����
			
			for(int i = k; i < numbers.length - 1; i++) { // numbers �迭���� �������� ���� ���ڸ� ����
				numbers[i] = numbers[i + 1];
			}
			System.out.println(Arrays.toString(numbers)); // number �迭���� �������� 6���� ���ڸ� �̰� �� ���� �迭�� ���
		}
		System.out.print("���� ���� ���� : ");
		System.out.println(Arrays.toString(lotto)); // �������� ���� ���� ���� 6�� ���
		
		Arrays.sort(lotto); // lotto �迭���� ũ�� ������� ��ġ�� �����մϴ�.
		System.out.println(Arrays.toString(lotto)); // ������� ������ ���� ���
		
			
	}
}
