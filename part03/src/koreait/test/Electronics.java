package koreait.test;
// �ۼ��� : �Ӻ���
public class Electronics extends Product {
	
	@Override
	public String sell(Object obj) { // 5��
		return String.format("������ǰ - %s (1set)", obj);
	}
	
	private double kwh; // 8��
	
	public double getKwh() { // 8��
		return kwh;
	}
	
	public void setKwh(double kwh) { // 8��
		this.kwh = kwh;
	}
	
	public Electronics(int price, String prdName) { // 9��
		this.price = price;
		this.prdName = prdName;
	}
	
	public Electronics() { // 9��
	}
	
	public double power(double kwh) { // 11��
		return kwh * 24;
	}

	@Override
	public String toString() { // 12��
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
}
