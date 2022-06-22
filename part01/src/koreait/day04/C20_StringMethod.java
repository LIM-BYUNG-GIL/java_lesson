package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {
		
		String message = "hello~"; // java.lang.String (기본패키지 클래스)
		
		// String 클래스의 메소드는 많습니다. 다 외우고 사용하는 것이 아니고 메소드의 이름, 인자, 리턴형식을 참조해서 사용합니다.
		
//		message.length(); // public int length()
//		message.charAt(0); // public char charAt(int index)
//		
//		message.equals("Hello~"); // public boolean equals(Object anObject), Object는 모든 타입
//								  // message가 String타입이므로 Object는 String으로 해석합니다.
		
		// 리턴값 형식은?
//		message.indexOf('e'); // int 1
//		message.indexOf("lo"); // int 3
//		message.substring(2); // String llo~
//		message.substring(2, 4); // String ll
//		message.replace("ll", "*@"); // String he*@o~
		// 메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 개수와 형식이 다르게 정의된 것.
		
		int len = message.length();
		char temp = message.charAt(3); // 0번부터 시작해서 3번 문자가 무엇인지 리턴.
		boolean isState = message.equals("Hello~"); // 문자열이 같은지
		
		System.out.println("length() = " + len); // 6
		System.out.println("charAt(3) = " + temp); // l
		System.out.println("equals(\"Hello\") = " + isState); // false
		
		System.out.println("indexOf('e') = " + message.indexOf('e'));
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));
		System.out.println("indexOf(\"ol\") = " + message.indexOf("ol")); // 찾는 값이 없다면 -1로 출력된다
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("lo")); // 3번
		System.out.println("test.lastIndexOf(\"lo\") = " + test.lastIndexOf("lo")); // 일치하는 마지막 위치 9번
		
		System.out.println("substring(2) = " + message.substring(2));
		System.out.println("message.substring(2, 4) = " + message.substring(2, 4));
		// subString에서 지정할 수 있는 숫자는 0부터 ~length()까지 그 외의 값을 쓰면 IndexOutOfBounds 오류 발생합니다.
		
		System.out.println("replace(\"ll\", \"*@\") = " + message.replace("ll", "*@"));
		System.out.println("startsWith(\"H\") = " + message.startsWith("H"));
		System.out.println("endsWith(\"~\") = " + message.endsWith("~"));
		
		
		
		
	}
}
