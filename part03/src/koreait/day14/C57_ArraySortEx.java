package koreait.day14;

import java.util.Arrays;

public class C57_ArraySortEx {
	// 배열에 저장된 값 정렬하기 직접 구현하세요.
	public static void main(String[] args) {
		
		String[] names = {"제니", "다현", "나연", "신비", "은하", "모모"};
		
		System.out.println(Arrays.toString(names));
		
		for(int i = 0; i < names.length - 1; i++) {
			for(int k = i + 1; k < names.length; k++) {
				if(names[i].compareTo(names[k]) > 0) {
					String temp = names[i];
					names[i] = names[k];
					names[k] = temp;
				}
			}
			System.out.println((i+1) + "단계 " + Arrays.toString(names) + " " + (i+1) + "번째로 작은 값이 결정되었습니다");
		}
		
		
		
		
	}
}
