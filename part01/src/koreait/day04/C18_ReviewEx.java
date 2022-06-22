package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String best; // 특기 과목명 참조할 변수
		int kor;
		int eng;
		int sci;
		int count = 3;
		int bestScore;
		final String korean = "국어";
		final String english = "영어";
		final String science = "과학";
		
		System.out.println("[[성적 집계 :  평균, 총점, 특기과목 구하기]]");
		System.out.println("성적을 입력하세요.");
		System.out.print("국어 -> ");
		kor = sc.nextInt();
		System.out.print("영어 -> ");
		eng = sc.nextInt();
		System.out.print("과학 -> ");
		sci = sc.nextInt();
		
		System.out.println(">> 처리되었습니다.");
		System.out.println("총점 : " + (kor + eng + sci));
		System.out.printf("평균 : %d (%.2f), 과목수 : %d\n", (kor + eng + sci) / count, (kor + eng + sci) / (double)count, count);
		
		if(kor > eng) {
			best = korean;
			bestScore = kor;
		}
		else {
			best = english;
			bestScore =eng;
		}
		
		if(bestScore < sci) best = science;
		
		System.out.printf("이 학생의 특기 과목은 . %s . 입니다.", best);
	}
}
