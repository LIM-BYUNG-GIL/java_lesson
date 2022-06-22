package koreait.test;
// 작성자 : 임병길
public class Bike extends Product {

	@Override
	public String sell(Object obj) { // 4번
		return String.format("추가 할인 행사 - %d %% 인하", obj);
	}
	
	private int speed; // 6번
	
	public int getSpeed() { // 6번
		return speed;
	}
	
	public void setSpeed(int speed) { // 6번
		this.speed = speed;
	}
	
	public Bike(int price, String prdName, int speed) { // 7번
		this.price = price;
		this.prdName = prdName;
		this.speed = speed;
	}
	
	public Bike() { // 7번
	}
	
	public String ride(int speed) { // 10번
		return String.format("당신은 이것을 시속 %dkm로 탈 수 있습니다.", speed);
	}

	@Override
	public String toString() { // 12번
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
}
