package koreait.day09;

import java.util.*;

public class C43_RedPenExam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5; // 문제 개수
		int max_size = MathProblem.max_size; // size변수값이 max_size 초과하는지 검사 추가
		
		MathProblem[] problems = new MathProblem[size];
		// 모든 문제 저장하는 배열
		
		// 배열의 타입은 MathProblem 객체참조형 : n1, n2, op, isCorrect
		
		int n1, n2, ans;
		int cnt = 0;
		System.out.println("-----------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------------------------------");
		System.out.println("시작합니다.");
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb(); // n1, n2 값이 객체의 필드로 난수 생성.
			
//			System.out.print("문제 " + (i + 1) + ". " + temp.getN1() + "+ " + temp.getN2() + " = 답 입력 -> ");
			System.out.print("문제 " + (i + 1) + ". " + temp.problem() + " 답 입력 -> ");
			ans =sc.nextInt();
			
			if(ans == temp.showAnswer()) { // 정답과 비교. 맞은 개수 count
				cnt++;
				temp.setCorrect(true);
			}
			problems[i] = temp;
		}
		System.out.println("-----------------------------------------------");
		System.out.println("채점 합니다. 맞은 개수 " + cnt + " (" + (cnt * 100 / size) + " 점)"); // 100 / size 는 1문제당 점수
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		// 아래코드는 형식일뿐 전체적으로 수정될 내용 많습니다. -> problem 배열을 활용하고 isCorrect 필드를 설정하세요.
//		for(int i = 0; i < problems.length; i++)
////			if(problems[i].isCorrect() == false) // 틀렸을 때
//			if(!problems[i].isCorrect()) // 틀렸을 때
//			System.out.println("문제 " + (i + 1) + ". " + problems[i].problem() + problems[i].showAnswer());
		
		// for each로 변경하기
		for(MathProblem temp : problems)
			if(!temp.isCorrect())
				System.out.println(temp.problem() + temp.showAnswer());
		
		
		sc.close();
	}
}
