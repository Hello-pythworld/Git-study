package kr.co.koreait;

public class Ex08_Array {

	public static void main(String[] args) {
//		 배열(Array)
//		  - 같은 자료형을 가진 값들을 하나의 변수로 관리함.

//		요소(Element)
//		 - 배열에 들어간 각각의 값들을 요소라고 표현

//		인덱스(Index)
//		 - 배열의 요소에 접근하기 위해 사용되는 번호 (요소의 위치를 의미함)
//		 - 인덱스는 0부터 시작!
		int[] arr = new int[4]; // 4만큼의 크기를 가진 배열 생성

		arr[0] = 10; // 0번 인덱스에 10을 넣겠다.
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		System.out.println("0번 인덱스 조회 : " + arr[0]); // 0번 인덱스의 요소를 조회하겠다.
		System.out.println("1번 인덱스 조회 : " + arr[1]);
		System.out.println("2번 인덱스 조회 : " + arr[2]);
		System.out.println("3번 인덱스 조회 : " + arr[3]);

		for(int num : arr) {
			System.out.println(num);
		}
		
		int[] numbers = new int[10];

		// 배열의 요소에 랜덤 숫자 넣기
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 30) + 1;
		}
//		배열의 요소 1개씩 꺼내서 출력하기
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("===========================================");
//		배열의 요소 1개씩 꺼내서 짝수인것만 sum0에 저장(합계)
		int sum = 0;
		for (int o = 0; o < numbers.length; o++) {
			if (numbers[o] % 2 == 0) {
				sum += numbers[o];
			}
		}
		System.out.printf("%d", sum);
	}
}
