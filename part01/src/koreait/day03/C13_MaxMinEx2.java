package koreait.day03;
// 작성자 : 임병길
import java.util.Scanner;

public class C13_MaxMinEx2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n1;
	int n2;
	int n3;
	int max;
	int min;
	
	// n1, n2, n3 의 키보드 입력(사용자 입력)
	System.out.print("n1 >>> ");
	n1 = sc.nextInt();
	System.out.print("n2 >>> ");
	n2 = sc.nextInt();
	System.out.print("n3 >>> ");
	n3 = sc.nextInt();
	System.out.printf("n1=%d\t n2=%d\t n3=%d\n", n1, n2, n3);
	
	
	// n1, n2, n3 중에 최댓값, 최솟값 구하기
	if(n1 > n2) {
		max = n1; // max 임시값
		min = n2;
	}else {
		max = n2; // max 임시값
		min = n1;
	}
	
	if(max < n3) {
		max = n3; // max 임시값보다 남은 1개 n3이 더 크다면 max값으로 넣어준다
	}
	
	if(min > n3) {
		min = n3;
	}
	
	System.out.println("max = " + max);
	System.out.println("min = " + min);

	
	}
}
