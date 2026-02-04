package kr.co.koreait;

import java.util.ArrayList;

public class Ex22_Main {

	public static void main(String[] args) {
		Ex22_1_Computer c = new Ex22_1_Computer();
		Ex22_1_Samsong s = new Ex22_1_Samsong();
		Ex22_2_Dog d = new Ex22_2_Dog();
		c.powerOn();
		c.powerOff();
		s.powerOn();
		s.powerOff();
		d.eat();
		d.sleep();
		d.makeSound();
		
		ArrayList<Ex22_2_Dog> list = new ArrayList<>();
		list.add(d);
		list.add(new Ex22_2_Dog());
		
		System.out.println(list.get(0));
		
		list.get(0).makeSound();
		list.get(1).makeSound();
	}

}
