package koreait.day07;

import java.util.Random;
import java.util.Scanner;
// 작성자 임병길
public class C42_Day07Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[] answer = new int[10];
		int[] num1 = new int[10]; 
		int[] num2 = new int[10];
		int sum;
		int score = 0;
		int count = 0;
		
		
		System.out.println("---------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("---------------------------------");
		System.out.println("시작합니다");
		
		for(int i = 0; i < answer.length; i++) {
			num1[i] = r.nextInt(90) + 10;
			num2[i] = r.nextInt(90) + 10;
			sum = num1[i] + num2[i];
			System.out.print("문제 " + (i + 1) + ". " + num1[i] + " + " + num2[i] + " = 답 입력 - > ");
			answer[i] = sc.nextInt();
			if(sum == answer[i]) {
				count++;
				score += 10;
			}
		}
		
		System.out.println("---------------------------------");
		System.out.println("채점합니다. 맞은 개수 " + count + " ( " + score + " 점)");
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		
		for(int i = 0; i < answer.length; i++) {
			sum = num1[i] + num2[i];
			if(sum != answer[i]) {
				System.out.println("문제 " + (i + 1) + ". " + num1[i] + " + " + num2[i] + " = " + sum);
			}
		}
		
		sc.close();
		
	}
}
