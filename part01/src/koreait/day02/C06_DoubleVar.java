package koreait.day02;

public class C06_DoubleVar {

	public static void main(String[] args) {
		/* 1. main 메소드 안에서만 사용하는 지역변수를 선언합니다.
		 * 2. 기본형 (primitive) 데이터 타입 : 
 		 * 		실수 형식 float,double 
		 */
		
		//변수 선언
		float p1;
		double p2;
		
		//변수선언과 초기화
		float q1 = 3.14f;		//  float 리터럴은 f(또는 F)로 표시합니다.
								
//		float q1 = 3.14;  		//오류
//						3.14 는 double형식의 리터럴. 8바이트를 4바이트에 대입하는 것이 자동으로 안됨.
		double q2 = 3.14;
		
	}

}
