package koreait.test;
// �ۼ��� : �Ӻ���
public class Bike extends Product {

	@Override
	public String sell(Object obj) { // 4��
		return String.format("�߰� ���� ��� - %d %% ����", obj);
	}
	
	private int speed; // 6��
	
	public int getSpeed() { // 6��
		return speed;
	}
	
	public void setSpeed(int speed) { // 6��
		this.speed = speed;
	}
	
	public Bike(int price, String prdName, int speed) { // 7��
		this.price = price;
		this.prdName = prdName;
		this.speed = speed;
	}
	
	public Bike() { // 7��
	}
	
	public String ride(int speed) { // 10��
		return String.format("����� �̰��� �ü� %dkm�� Ż �� �ֽ��ϴ�.", speed);
	}

	@Override
	public String toString() { // 12��
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
}
