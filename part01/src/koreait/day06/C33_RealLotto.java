package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
	// 작성자 : 임병길
	public static void main(String[] args) {
		int[] numbers = new int[45]; // 크기가 45인 numbers 배열 생성
		Random r = new Random(); // 랜덤 뽑기
		
		for(int i = 0; i < 45; i++) { // 인덱스 범위 : 0 ~ 44
			numbers[i] = i + 1; // 값 범위 : 1 ~ 45
		}
		
		System.out.println("numbers 배열 초기값 --------------------------------");
		System.out.println(Arrays.toString(numbers)); // numbers 배열 값 나타내기
		System.out.println("------------------------------------------------");
		
		int[] lotto = new int[6]; // 크기가 6인 lotto 배열 생성
		int k; // 변수 k 생성
		for(int cnt = 0; cnt < 6; cnt++) { // for문 안에 지역변수 cnt 생성하여 로또 번호 6개 뽑기
			
			k = r.nextInt(45 - cnt); // 1 ~ 45 숫자를 뽑은 만큼 총 개수를 줄여가며 변수 k 값 랜덤으로 설정
			System.out.println("k = " + k + ", number = " + numbers[k]); // numbers 배열에서 랜덤으로 뽑은 숫자와 위치 출력
			
			lotto[cnt] = numbers[k]; // 랜덤으로 뽑은 숫자 lotto 배열에 삽입
			
			for(int i = k; i < numbers.length - 1; i++) { // numbers 배열에서 랜덤으로 뽑은 숫자를 삭제
				numbers[i] = numbers[i + 1];
			}
			System.out.println(Arrays.toString(numbers)); // number 배열에서 랜덤으로 6개의 숫자를 뽑고 난 후의 배열값 출력
		}
		System.out.print("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto)); // 최종으로 뽑힌 랜덤 숫자 6개 출력
		
		Arrays.sort(lotto); // lotto 배열값의 크기 순서대로 위치를 변경합니다.
		System.out.println(Arrays.toString(lotto)); // 순서대로 정렬한 것을 출력
		
			
	}
}
