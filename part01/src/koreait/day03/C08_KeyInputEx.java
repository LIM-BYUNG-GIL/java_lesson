package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int sw;
		double r;
		double cw;
		double cl;
		final double PI = 3.14;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.print("사각형의 가로 길이를 입력하세요 : ");
		x = sc.nextInt();
		System.out.print("사각형의 세로 길이를 입력하세요 : ");
		y = sc.nextInt();
		sw = x * y;
		System.out.println("가로 : " + x + " ㎝");
		System.out.println("세로 : " + y + " ㎝");
		System.out.println("넓이를 구했습니다. -> " + sw + " ㎠");
		System.out.println();
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.print("원의 반지름 길이를 입력하세요 : ");
		r = sc.nextDouble();
		cw = PI * r * r;
		cl = 2 * PI * r;
		System.out.printf("반지름 : %.3f ㎝ \n", r);
		System.out.printf("둘레를 구했습니다. -> %.3f ㎝ \n", cl);
		System.out.printf("넓이를 구했습니다. -> %.3f ㎠ \n", cw);
		
		sc.close(); // 키보드(표준입력장치) 자원 사용 해제.
		
		}
}
