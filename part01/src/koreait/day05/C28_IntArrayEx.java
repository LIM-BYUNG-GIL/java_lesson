package koreait.day05;

import java.util.Scanner;

// �ۼ��� : �Ӻ���
public class C28_IntArrayEx {
	/*
	 * 1. int �迭ũ�� 5�� �����ϼ���. �̸��� nums
	 * 2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	 * 3. �Էµ� ���� �հ�, ����� ���մϴ�.
	 * 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 * �� maxOfArray, minOfArray : ���ڴ� int �迭, ��ȯ������ int
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("���ڸ� �Է��ϼ���(�� 5��) >>> ");
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		
		System.out.println("�Էµ� ���� �հ� : " + sum + ", �Էµ� ���� ��� : " + sum / nums.length);
		
		int max = maxOfArray(nums);
		System.out.println("�Էµ� ���� �ִ� : " + max);
		System.out.println("�Էµ� ���� �ּڰ� : " + minOfArray(nums, max));
		
		sc.close();
		
	}
	
	// max, min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ�մϴ�.
	// �迭��� 1������ ��������ұ��� max, min �� ������� ���ؼ�
	// max�� �� ������ ������(min�� �� ������ ũ��) max(min) ���� �迭��Ұ����� �����մϴ�.
	// -> �񱳰� ������ ���� max, min ������ �˴ϴ�.
	
	public static int maxOfArray(int[] array) {
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
		
		
	}
	
	public static int minOfArray(int[] array, int max) {
		int min = max;
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		return min;
		
	}
	
}
