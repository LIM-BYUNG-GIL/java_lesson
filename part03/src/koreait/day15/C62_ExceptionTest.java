package koreait.day15;

import java.util.Scanner;

// Throwable 클래스의 하위클래스
// : Error -> 개발 중인 프로그램 외부의 문제. 시스템 상의 오류. (HW, OS, JVM ...)
// : Exception -> 개발 중인 프로그램과 관련된 문제

public class C62_ExceptionTest {
	public static void main(String[] args) {
		
		// Exception 예시 1 : java.lang.NullPointerException (객체 참조가 null 이면 메서드 실행못합니다.)
		String message = null;
		char temp = message.charAt(0); // message 문자열에서 첫번째(0) 글자 1개 가져옵니다.
		
		// Exception 예시 2 : java.lang.ArrayIndexOutOfBoundsException
		int[] nums = new int[5]; // 배열선언 : 요소 5개입니다.
		nums[5] = 100;
		
		// Exception 예시 3
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 >>> ");
//		int a = sc.nextInt(); // 키보드 입력을 정수로 변환해서 변수에 저장합니다.
		// 숫자 외에 다른 문자 입력하면 Exception 발생 : java.util.InputMismatchException
		
		int a = Integer.parseInt(sc.nextLine());
		// 숫자 외에 다른 문자 입력하면 Exception 발생 : java.lang.NumberFormatException
		System.out.println("당신이 입력한 값 : " + a);
	}
}

/*
 * 문법 오류 : int a = 4.1; 와 같이 컴파일 자체가 안됩니다.
 * Exception 요약 : 문법오류가 아닙니다. 실행하면서 발생하는 오류입니다.(발생가능성을 고려해서 프로그래밍해야합니다.)
 *  -> 원인에 따라 다른 이름 XXXXException이 발생하고 이들은 Exception 클래스의 자식 클래스입니다.
 *  -> Exception 이 실행 중에 발생하면 그 이후는?..... 프로그램이 그 시점부터 중단됩니다.
 *  따라서 , Exception을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야합니다.
 */
