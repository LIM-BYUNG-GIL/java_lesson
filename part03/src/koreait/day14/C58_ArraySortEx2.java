package koreait.day14;

import java.util.Arrays;

public class C58_ArraySortEx2 {
	// �迭�� ����� �� �����ϱ� ���� �����ϼ���.
	public static void main(String[] args) {
		
		int[] nums = {34, 77, 19, 56, 45, 9};
		int temp;
		
		System.out.println(Arrays.toString(nums));
		for(int i = 0; i < nums.length - 1; i++) {
			for(int k = i + 1; k < nums.length; k++) {
				if(nums[i] > nums[k]) {
					temp = nums[i];
					nums[i] = nums[k];
					nums[k] = temp;
				}
			}
			System.out.println((i+1) + "�ܰ� " + Arrays.toString(nums) + " " + (i+1) + "��°�� ���� ���� �����Ǿ����ϴ�");
		}
		
		
		
		
	}
}
