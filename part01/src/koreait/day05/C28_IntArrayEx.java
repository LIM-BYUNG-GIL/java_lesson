package koreait.day05;

import java.util.Scanner;

// 작성자 : 임병길
public class C28_IntArrayEx {
	/*
	 * 1. int 배열크기 5를 선언하세요. 이름은 nums
	 * 2. 배열 요소의 값은 사용자 입력으로 저장합니다.
	 * 3. 입력된 값의 합계, 평균을 구합니다.
	 * 4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
	 * ㄴ maxOfArray, minOfArray : 인자는 int 배열, 반환값형식 int
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요(총 5번) >>> ");
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		
		System.out.println("입력된 값의 합계 : " + sum + ", 입력된 값의 평균 : " + sum / nums.length);
		
		int max = maxOfArray(nums);
		System.out.println("입력된 값의 최댓값 : " + max);
		System.out.println("입력된 값의 최솟값 : " + minOfArray(nums, max));
		
		sc.close();
		
	}
	
	// max, min 변수를 각각 배열의 0번 요소값으로 초기화합니다.
	// 배열요소 1번부터 마지막요소까지 max, min 과 순서대로 비교해서
	// max가 그 값보다 작으면(min이 그 값보다 크면) max(min) 값을 배열요소값으로 변경합니다.
	// -> 비교가 끝나면 최종 max, min 결정이 됩니다.
	
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
