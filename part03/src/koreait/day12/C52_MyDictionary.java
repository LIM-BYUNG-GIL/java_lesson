package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

// 작성자 : 임병길
public class C52_MyDictionary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드 입력 시 nextInt()와 nextLine() 등을 같이 쓰면 입력이 정상 실행 안됩니다.
//		HashMap<String,String> word = new HashMap<>(); // 단어장 저장할 자료구조
		TreeMap<String,String> word = new TreeMap<>(); // 이진 검색 가능한 구조로 Map을 생성 : 정렬이되는 Map
		String sel, eng, kor;
		boolean temp = true;
		
		System.out.println("선택 기능 👉 1.단어저장 2.단어검색 3.단어장보기 4.프로그램 끝내기");
		while(temp) {
			System.out.print("선택 ✏️ -> ");
			sel = sc.nextLine();
			switch(sel) {
			case "1":
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("Korean -> ");
				kor = sc.nextLine();
				word.put(eng, kor);
				break;
			case "2":
				System.out.print("검색단어 Engilsh -> ");
				eng = sc.nextLine();
				System.out.println("단어장 검색했습니다. 결과 => " + word.get(eng));
				break;
			case "3":
				System.out.println("단어장 전체보기 : " + word);
				break;
			case "4":
				temp = false;
				break;
			default :
				System.out.println("잘못 입력된 선택입니다. 1 ~ 4를 입력하세요.");
				break;
			}
//			if(sel.equals("1")) {
//				System.out.print("English -> ");
//				eng = sc.nextLine();
//				System.out.print("Korean -> ");
//				kor = sc.nextLine();
//				word.put(eng, kor);
//			}else if(sel.equals("2")) {
//				System.out.print("검색단어 English -> ");
//				eng = sc.nextLine();
//				System.out.println("단어장 검색했습니다. 결과 => " + word.get(eng));
//			}else if(sel.equals("3")) {
//				System.out.println("단어장 전체보기 : " + word);
//			}else if(sel.equals("4")) {
//				break;
//			}else {
//				System.out.println("잘못 입력된 선택입니다. 1 ~ 4를 입력하세요.");
//			}
		}
		
		sc.close();
	} // 참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다.
	  // int score =  nteger.parseInt(sc.nextLine());
	  // 이유 : nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 흐름에 방해가 됩니다.
	  // 결론 : 한 소스 파일에서 nextInt() 만 사용 또는 nextLine()만 사용하거나 합니다.
}
