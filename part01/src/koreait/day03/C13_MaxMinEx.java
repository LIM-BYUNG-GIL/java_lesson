package koreait.day03;
// 작성자 : 임병길
import java.util.Scanner;

public class C13_MaxMinEx {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n1;
	int n2;
	int n3;
	int max;
	int min;
	
	System.out.print("n1의 값을 입력하세요 : ");
	n1 = sc.nextInt();
	System.out.print("n2의 값을 입력하세요 : ");
	n2 = sc.nextInt();
	System.out.print("n3의 값을 입력하세요 : ");
	n3 = sc.nextInt();
	
	if(n1 > n2) {
		max = n1;
	}else {
		max = n2;
	}
	
	if(max < n3) {
		max = n3;
	}
	
	System.out.println("max값은 : " + max + " 입니다");

	if(n1 > n2) {
		min = n2;
	}else {
		min = n1;
	}
	
	if(min > n3) {
		min = n3;
	}
	
	System.out.println("min값은 : " + min + " 입니다");
	
	}
}
