package kr.co.training;

public class Ex21_Main {

	public static void main(String[] args) {

		Ex21_1_Order o = new Ex21_1_Order();
		Ex21_2_Warlord w = new Ex21_2_Warlord();
		Ex21_3_Character c = new Ex21_3_Character();
		Ex21_3_Sorceress s = new Ex21_3_Sorceress();
		o.setAmount(10000);
		o.setNumber("1");
		o.setStatus("만드는 중입니다~!");
		o.buy();
		w.walk();
		w.stop();
		w.attack();
		w.levelUp();
		s.skill();
		s.attack();
		s.walk();
		s.stop();
		System.out.println(s.toString());
	}
}