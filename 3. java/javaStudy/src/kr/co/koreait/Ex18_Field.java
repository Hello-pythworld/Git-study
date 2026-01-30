package kr.co.koreait;

public class Ex18_Field {
//	필드
	int num = 10; // 인스턴스 변수

	public static void main(String[] args) {
//		필드(=멤버 변수)
//		 - 클래스 레벨의 변수를 의미
		int num2 = 20;
		
		Ex18_1_Car car = new Ex18_1_Car();
		car.wheel = 5;
		
		System.out.println(car.speed);
		System.out.println(car.wheel);
		
		Ex18_1_Car sonata = new Ex18_1_Car();
		sonata.wheel = 7;
		sonata.speed = 140;
		
		System.out.println(sonata.speed);
		System.out.println(sonata.wheel);
		
		Ex18_2_Person jjangu = new Ex18_2_Person("신짱구", "떡잎마을", 5, "없음");
		Ex18_2_Person yeonghun = new Ex18_2_Person("이영훈", 30);
		yeonghun.introduce();
//
//		jjangu.name = "신짱구";
		jjangu.addr = "떡잎마을";
		jjangu.age = 5;
		jjangu.phonenumber = "없음";
		jjangu.introduce();
//		
//		Ex18_2_Person minsu = new Ex18_2_Person();
//		
//		minsu.name = "김민수";
//		minsu.addr = "인천";
//		minsu.age = 19;
//		minsu.phonenumber = "010-1234-1234";
//		minsu.introduce();
		System.out.println(Ex18_2_Person.HOBBY);
		
//		Ex18_2_Person.introduce();
		
		}

}
