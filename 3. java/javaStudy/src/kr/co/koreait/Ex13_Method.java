package kr.co.koreait;

import java.util.Scanner;

public class Ex13_Method {

	public static void main(String[] args) {
//		 메서드
//		  - 정의된 동작이나 기능을 수행
		Ex13_2_Person i = new Ex13_2_Person();
		Ex13_Method m = new Ex13_Method();
		Ex13_3_BankAccount b = new Ex13_3_BankAccount();
		String result = m.printHello("안녕하세요 저는 홍길동입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println(result);
		
		int[] numbers = {100, 200, 300, 400};
		
		Ex13_1_Calc calc = new Ex13_1_Calc();
		
		int result1 = calc.add(5,3);
		int sum = calc.sub(numbers);
		System.out.println(result1);
		
		int resultSum = calc.sub(new int[]{1, 2, 3});
		
		calc.add(10,10);
		calc.add(20,10);
		calc.add(3,3);
		System.out.println("-------------------------------------");
//		객체 생성(=인스턴스화)
//		 - 코드를 메모리에 올리는 과정
////		 - 클래스명 변수명 = new 클래스명();
////		int result3 = calc.sum(9,4);
//		System.out.println(result3);
		int result4 = calc.mul(1, 2, 3, 4);
		System.out.println(result4);
		int result5 = calc.div(4,3);
		System.out.println(result5);
		System.out.println("-------------------------");
		i.introduce();
		System.out.println("-------------------------");
		b.deposit(3000);
		b.withdraw(5000);
		String check = b.checkBalance();
		System.out.println(check);
		
		System.out.println(b.checkBalance());
	}
		
	

	// 안녕하세요 출력하는 메서드
//		public 반환타입 메서드명(자료형 매개변수명) {  }
//		- 반환 타입의 종류 : void, int, String, int[], ArrayList<>, ...
//		- void : 반환 타입 없음(return 없음)
	public String printHello(String str) {
		System.out.println(str);
		return "잘 출력되었습니다.";
	}
	
	
}
