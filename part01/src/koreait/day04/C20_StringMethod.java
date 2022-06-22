package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {
		
		String message = "hello~"; // java.lang.String (�⺻��Ű�� Ŭ����)
		
		// String Ŭ������ �޼ҵ�� �����ϴ�. �� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�, ����, ���������� �����ؼ� ����մϴ�.
		
//		message.length(); // public int length()
//		message.charAt(0); // public char charAt(int index)
//		
//		message.equals("Hello~"); // public boolean equals(Object anObject), Object�� ��� Ÿ��
//								  // message�� StringŸ���̹Ƿ� Object�� String���� �ؼ��մϴ�.
		
		// ���ϰ� ������?
//		message.indexOf('e'); // int 1
//		message.indexOf("lo"); // int 3
//		message.substring(2); // String llo~
//		message.substring(2, 4); // String ll
//		message.replace("ll", "*@"); // String he*@o~
		// �޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.
		
		int len = message.length();
		char temp = message.charAt(3); // 0������ �����ؼ� 3�� ���ڰ� �������� ����.
		boolean isState = message.equals("Hello~"); // ���ڿ��� ������
		
		System.out.println("length() = " + len); // 6
		System.out.println("charAt(3) = " + temp); // l
		System.out.println("equals(\"Hello\") = " + isState); // false
		
		System.out.println("indexOf('e') = " + message.indexOf('e'));
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));
		System.out.println("indexOf(\"ol\") = " + message.indexOf("ol")); // ã�� ���� ���ٸ� -1�� ��µȴ�
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("lo")); // 3��
		System.out.println("test.lastIndexOf(\"lo\") = " + test.lastIndexOf("lo")); // ��ġ�ϴ� ������ ��ġ 9��
		
		System.out.println("substring(2) = " + message.substring(2));
		System.out.println("message.substring(2, 4) = " + message.substring(2, 4));
		// subString���� ������ �� �ִ� ���ڴ� 0���� ~length()���� �� ���� ���� ���� IndexOutOfBounds ���� �߻��մϴ�.
		
		System.out.println("replace(\"ll\", \"*@\") = " + message.replace("ll", "*@"));
		System.out.println("startsWith(\"H\") = " + message.startsWith("H"));
		System.out.println("endsWith(\"~\") = " + message.endsWith("~"));
		
		
		
		
	}
}
