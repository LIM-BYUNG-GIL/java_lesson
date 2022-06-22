package koreait.day11;

public class AShapeTest {
	// main �޼ҵ�� Ŭ������ ������� ���ø����̼��Դϴ�.
	// �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻�޼ҵ带 �߰��ϸ�?
	public static void main(String[] args) {
		Triangle tri = new Triangle(100, 84);
		tri.shapeName = "�����ﰢ��";
		System.out.println(tri);
		System.out.println("���� = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89);
		cir.shapeName = "��";
		System.out.println(cir);
		System.out.println("���� = " + cir.getArea());
	}
}

/*
 * ���� : �޼ҵ� �������� �� ����������
 * �θ� public -> �ڽ� default : ����
 * �θ� default -> �ڽ� public : ����
 */

abstract class AShape { // ����
	protected String shapeName;
	protected int width;
	protected int heigth;
	
	public AShape() { // AShape() �� ��ü�� ���� ������� �ڽ� ��ü ��������� ���� 
		System.out.println("AShape ����Ʈ ������ �����մϴ�");
	}
	
	// �߻�Ŭ������ Ŀ���һ����� ���峪��?
	public AShape(int width, int heigth) {
		System.out.println("AShape Ŀ���� ������ �����մϴ�");
		this.width = width;
		this.heigth = heigth;
	}
	
	public abstract double getArea(); // ������ ����
	
	// �߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ� Ŭ������ �������� �� �ֽ��ϴ�.
	public Object explain() { // ���ø����̼� �Ϸ� �� �߻�޼ҵ� �߰� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ� �߰�
		return null;
	}

	@Override
	public String toString() {
		return "AShape [shapeName=" + shapeName + ", width=" + width + ", heigth=" + heigth + "]";
	}
	
}

class Triangle extends AShape {
	
	public Triangle(int width, int heigth) {
		super(width, heigth);
	}
	
	@Override
	public double getArea() {
		return width * heigth / 2;
	}
	
}

class Circle extends AShape {
	private int radius; // ������

	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}

	@Override
	public String toString() {
		return "Cicle [radius=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", heigth=" + heigth + "]";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}

class Rectangle extends AShape {

	@Override
	public double getArea() {
		return width * heigth;
	}
	
}
