package koreait.day14;

import java.util.Arrays;

public class C57_ArraySortEx {
	// �迭�� ����� �� �����ϱ� ���� �����ϼ���.
	public static void main(String[] args) {
		
		String[] names = {"����", "����", "����", "�ź�", "����", "���"};
		
		System.out.println(Arrays.toString(names));
		
		for(int i = 0; i < names.length - 1; i++) {
			for(int k = i + 1; k < names.length; k++) {
				if(names[i].compareTo(names[k]) > 0) {
					String temp = names[i];
					names[i] = names[k];
					names[k] = temp;
				}
			}
			System.out.println((i+1) + "�ܰ� " + Arrays.toString(names) + " " + (i+1) + "��°�� ���� ���� �����Ǿ����ϴ�");
		}
		
		
		
		
	}
}
