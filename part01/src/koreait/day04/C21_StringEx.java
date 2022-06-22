package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
	// �ۼ��� : �Ӻ���
	public static void main(String[] args) {
		
		/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
		 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
		 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
		 *  
		 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
		 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ��(length()-1)���� substring ������ ���ڿ��� equals ��
		 *  
		 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
		 *  
		 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 *  		�� 3���� ���ڿ��� length() �� 6���� ��
		 *  
		 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
		 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
		 */

		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;
		
		
		System.out.print("����� �̸����� �Է��ϼ���. >>> ");
		email = sc.nextLine(); // Ű���� �Է��� ���ڿ��� ó���մϴ�.
		int idx = email.indexOf('@');
		String domain = email.substring(idx + 1);
		
		if(idx != -1 && idx == email.lastIndexOf('@')) {
			if(domain.equals("gmail.com")) {
				String account = email.substring(0, idx);
				if(account.length() >= 6) {
					if((account.indexOf('$') == -1) && (account.indexOf('%') == -1)) {
						System.out.printf("����� �����̸��� >>> %s �Դϴ�\n", account);
					}else {
						System.out.println("�޽��� : $, %�� ����� �� ���� ��ȣ�Դϴ�");
						isValid = false;
					}
				}else {
					System.out.println("�޽��� : ���� �̸��� 6���� �̻��̿����մϴ�.");
					isValid = false;
				}
			}else {
				System.out.println("�޽��� : ������ �̸��� Ʋ���ϴ�.");
				isValid = false;
			}
		}else {
			System.out.println("�޽��� : �̸��� ������ �ƴմϴ�.");
			isValid = false;
		}
		
		
		System.out.println(isValid);
		
		sc.close();
		
		
		
		
		
		
		
		
//		String google = "@gmail.com";
		
		// �Է��� email�� ó�� ���� 1, 2, 4, 5�� �ش����� ������ �޼��� ����ϰ� isValid ������ false�� �մϴ�. -> isValid ���
//		if((email.substring(email.length() - 10)).equals(google)) {
//			System.out.println(isValid);
//		}else {
//			System.out.println(!isValid + " @ ��ȣ ������ �Ǿ����� �ʰų� gmail.com���� ������ �ʽ��ϴ�");
//		}
//		
//		System.out.println(email.substring(0, email.length() -10));
//		
//		if(email.length() >= 6) {
//			System.out.println(isValid);
//		}else {
//			System.out.println(!isValid + " �����̸��� 6���� �̻󿩾��մϴ�");
//		}
		
		
		
		
		
	}
}
