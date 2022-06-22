package koreait.day02;

public class C08_Test {
	public static void main(String[] args) {
		int x = 23;
		int y = 19;
		double r = 23.23;
		int sw = x * y;
		double cw = 3.14 * r * r;
		double cl = 2 * 3.14 * r;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로 : " + x + " ㎝");
		System.out.println("세로 : " + y + " ㎝");
		System.out.println("넓이를 구했습니다. -> " + sw + " ㎠");
		System.out.println();
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.printf("반지름 : %.3f ㎝ \n", r);
		System.out.printf("둘레를 구했습니다. -> %.3f ㎝ \n", cl);
		System.out.printf("넓이를 구했습니다. -> %.3f ㎠ \n", cw);
		
		// final 테스트
		// 		 변수선언 앞에 final(최종의) 키워드를 붙이면 값을 변경하지 못합니다.
		
		final int test = 123; // 값을 변경 못하는 상수입니다.
		System.out.println("test = " + test);
		
//		test = 456; 오류
		
		
		
		
		}
}
