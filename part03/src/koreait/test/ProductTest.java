package koreait.test;
// �ۼ��� : �Ӻ���
public class ProductTest {
	public static void main(String[] args) {
		
		Product[] cart = new Product[10]; // 13��
		
		cart[0] = new Bike(123000, "MTB", 25); // 13��
		cart[3] = new Bike(99000, "��õ��", 15); // 13��
		cart[1] = new Electronics(35000, "USB"); // 13��
		cart[5] = new Electronics(117000, "ipad"); // 13��
		cart[7] = new Electronics(2250000, "lg �����"); // 13��
		
		System.out.println(((Electronics) cart[7]).power(0.9)); // 14��
		
		for(int i = 0; i < cart.length; i++) { // 15��
			if(cart[i] != null && cart[i].price >= 100000)
				System.out.println(cart[i]);
		}
		
		System.out.println(((Bike) cart[0]).ride(25)); // 16��
		System.out.println(((Bike) cart[3]).ride(15)); // 16��
		
	}
}
