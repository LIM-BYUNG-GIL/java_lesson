package koreait.test;
// 작성자 : 임병길
public class ProductTest {
	public static void main(String[] args) {
		
		Product[] cart = new Product[10]; // 13번
		
		cart[0] = new Bike(123000, "MTB", 25); // 13번
		cart[3] = new Bike(99000, "삼천리", 15); // 13번
		cart[1] = new Electronics(35000, "USB"); // 13번
		cart[5] = new Electronics(117000, "ipad"); // 13번
		cart[7] = new Electronics(2250000, "lg 냉장고"); // 13번
		
		System.out.println(((Electronics) cart[7]).power(0.9)); // 14번
		
		for(int i = 0; i < cart.length; i++) { // 15번
			if(cart[i] != null && cart[i].price >= 100000)
				System.out.println(cart[i]);
		}
		
		System.out.println(((Bike) cart[0]).ride(25)); // 16번
		System.out.println(((Bike) cart[3]).ride(15)); // 16번
		
	}
}
