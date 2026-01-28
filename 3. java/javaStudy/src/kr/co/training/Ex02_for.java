package kr.co.training;

public class Ex02_for {

	public static void main(String[] args) {
//		1. 짝수를 출력하는 for문
//		 - 범위 1~20
//		 - 해당 범위안에 있는 짝수만 출력
//		for(int i=1; i<=20; i++) {
//			if(i%2 ==0) {
//				System.out.println(i);
//			}
//		}
//		2. 3과 5의 공배수를 출력하는 for문
//		 - 범위 : 1 ~ 100
//
//		System.out.println("1부터 100까지 3과 5의 공배수");
//		for (int i=1; i<100; i++) {
//				if(i % 3 == 0 && i % 5 == 0) {
//					System.out.println(i);
//				}
//		}
//		3. 10 팩토리얼의 값을 출력하는 for문
//		 - 10 팩토리얼 = 1*2*3*4*5*6*7*8*9*10
//		 - 값 : 3628800
		
//		System.out.println("10 팩토리얼의 값을 출력");
//		int multiply = 1;
//		for (int i=1; i<=10; i++) {
//			System.out.printf("", 1*multiply);
//		}
//		System.out.println(multiply);
//		
//		System.out.println("10 팩토리얼의 값을 출력");

//		int multiply = 1;
//		for (int i = 1; i <= 10; i++) {
//		    multiply *= i;
//		    System.out.println(i + "까지 곱한 값: " + multiply);
//		}
//		4. 아래의 별찍기를 구현하세요.
//		*
//		**
//		***
//		****
//		*****
		int height = 5;

		for(int i=0; i<height; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for(height=5; height-i > 0; height--) {
//			System.out.println();
//				for(int i=1; i<=3; i++){
//				System.out.print("*");
//	}
//		2단부터 9단까지 출력하는 구구단 프로그램 만들기
//		- 출력값 : "2*1=2" "2*2=4" ... "2*9=18"
		for(int i=2; i<=9; i++) {
			System.out.printf("%d단", i);
			System.out.println();
			for(int k=1; k<=9; k++) {
				System.out.printf("%d * %d = %d", i, k, i*k);
				System.out.println();
			}
		}
		}
}



