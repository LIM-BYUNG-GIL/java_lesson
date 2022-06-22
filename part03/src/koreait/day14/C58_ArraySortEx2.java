package koreait.day14;

import java.util.Arrays;

public class C58_ArraySortEx2 {
	// 배열에 저장된 값 정렬하기 직접 구현하세요.
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
			System.out.println((i+1) + "단계 " + Arrays.toString(nums) + " " + (i+1) + "번째로 작은 값이 결정되었습니다");
		}
		
		
		
		
	}
}
