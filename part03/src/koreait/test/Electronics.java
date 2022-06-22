package koreait.test;
// 작성자 : 임병길
public class Electronics extends Product {
	
	@Override
	public String sell(Object obj) { // 5번
		return String.format("묶음상품 - %s (1set)", obj);
	}
	
	private double kwh; // 8번
	
	public double getKwh() { // 8번
		return kwh;
	}
	
	public void setKwh(double kwh) { // 8번
		this.kwh = kwh;
	}
	
	public Electronics(int price, String prdName) { // 9번
		this.price = price;
		this.prdName = prdName;
	}
	
	public Electronics() { // 9번
	}
	
	public double power(double kwh) { // 11번
		return kwh * 24;
	}

	@Override
	public String toString() { // 12번
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
}
