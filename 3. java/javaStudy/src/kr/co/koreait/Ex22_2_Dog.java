package kr.co.koreait;

public class Ex22_2_Dog extends Ex22_2_Animal{
	
	@Override
	public void eat() {
		System.out.println("강아지가 사료를 먹습니다.");
	}
	@Override
	public void sleep() {
		System.out.println("강아지가 잠을 잡니다.");
	}
	@Override
	public void makeSound() {
		System.out.println("멍멍소리를 냅니다.");
	}
	
	
}
