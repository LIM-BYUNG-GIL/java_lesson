package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {
	// �͸� Ŭ���� : anonymous. �̸��� ���� Ŭ����
	public static void main(String[] args) {
		
		// line(��)
		// �͸� ����(Inner) Ŭ���� ����. 1ȸ�� Ŭ���� ����(�߻�޼��� ������ �ʼ�)
		 AShape sha = new AShape() {
			// �߻�޼��� ������
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width + heigth;
			}
		};
		
		AShape sha2 = new AShape(20, 30) {
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width + heigth;
			}
		};
		
		System.out.println("sha ���� = " + sha.getArea());
		System.out.println("sha2 ���� = " + sha2.getArea());
		
		
		// ���� : �߻�Ŭ���� �ƴҶ��� �޼��� �������ؼ� ���� �͸�Ŭ����ó�� �� �� �ֳ���?
		// Ȯ���ϱ� // �� : �����ϴ�. �׷��� ������ �߻�޼��� �������ϸ鼭 �͸�Ŭ���� ���� ���ϴ�.
		
		Animal snake = new Animal() {
			int length;
			
			@Override
			public void act() {
				setName("�̱��Ƴ�");
				setColor("�����");
				length = 3;
				System.out.println("action : ���ٴϱ�");
			}
			
			@Override
			public String toString() {
				return "length = " + length;
			}
		};
		snake.act();
		System.out.println(snake);
	}
}
