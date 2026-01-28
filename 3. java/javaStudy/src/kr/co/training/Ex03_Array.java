package kr.co.training;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex03_Array {

	public static void main(String[] args) {

//		1. 5만큼의 길이를 가진 배열 arrString을 생성하세요.
//		2. 위에서 생성한 배열을 아래의 값으로 초기화 하세요.
//			-> "A", "B", "CD", "E", "FG"
//		3. 배열의 요소를 1개씩 꺼내서 꺼낸 요소가 "CD"일 경우 출력 후 반복문을 종료하세요.
		
//		--------------------------------------------------------------
//		1. 사용자에게 입력받은 점수를 보관할 scores 배열을 완성하세요. (크기 : 4)
//		2. 인덱스별 점수는 아래와 같습니다.
//			-> 0번 인덱스 : 국어점수
//			-> 1번 인덱스 : 영어점수
//			-> 2번 인덱스 : 수학점수
//			-> 3번 인덱스 : 과학점수
//		3. 사용자로부터 국어, 영어, 수학, 과학 점수를 입력받아 알맞은 배열의 위치에 할당하세요.
//		4. 배열에 있는 값의 합계 점수와 평균 점수를 출력하세요
		String[] arrString = new String[5];
		arrString[0] = "A";
		arrString[1] = "B";
		arrString[2] = "CD";
		arrString[3] = "E";
		arrString[4] = "FG";

		int i = 0;

		do {
		    System.out.println(arrString[i]);

		    if (arrString[i].equals("CD")) {
		        break;   // CD 만나면 즉시 종료
		    }

		    i++;
		} while (i < arrString.length);
		System.out.println("---------------------------------");
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[4];
		System.out.println("국어 점수 : ");
		scores[0] = sc.nextInt();
		System.out.println("영어 점수 : ");
		scores[1] = sc.nextInt();
		System.out.println("수학 점수 : ");
		scores[2] = sc.nextInt();
		System.out.println("과학 점수 : ");
		scores[3] = sc.nextInt();
		int sum = 0;
		for(int j = 0; j<scores.length; j++) {
			sum+= scores[j];
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("합계 : " + sum/scores.length);
		
//		System.out.print();
		
		int[] nums = {3, 1, 6, 2, 3, 7, 9};
		
		System.out.println("첫 번째 요소 : " + nums[0]);
		System.out.println("마지막 요소 : " + nums[nums.length-1]);
		
		// nums 배열에서 가장 큰 값과 가장 작은 값 구하기
//		int min = nums[0];
//		int max = nums[0];
		int min = Integer.MAX_VALUE; // +21억
		int max = Integer.MIN_VALUE; // -21억
		
		
		for(int k=0; k<nums.length; k++) {
			if(nums[k] > max) {
				max = nums[k];
			}
			
			if(nums[k] < min) {
				min = nums[k];
			}
		}
		
		System.out.println("가장 작은 값 : " + min);
		System.out.println("가장 큰 값 : " + max);
//		--------------------------------------------------
//		Arrays.toString()
//		 - 반복문 없이 배열의 값들을 문자열 형태로 출력해주는 메서드
		int[] numbers2 = {4, 2, 3, 1, 7, 5};
		
		System.out.println(Arrays.toString(numbers2));
//		Arrays.sort()
//		 - 배열에 있는 요소를 정렬해주는 메서드
		Arrays.sort(numbers2);
		
		System.out.println(Arrays.toString(numbers2));
		
		Integer[] numbers3 = {4, 2, 3, 1, 7, 5};
		Arrays.sort(numbers3, Comparator.reverseOrder());
		System.out.println(Arrays.toString(numbers3));
		
//		--------------------------------------------------------
//		얕은 복사
//		 - 배열의 주소 값만 가져와 참조하는 방식
//		 - 하나의 배열 객체를 두 변수가 함께 공유함
//		 	> 복사된 배열에서 수정하면 원본 배열도 영향을 받음.
		int[] arrCopy1 = new int[3];
		int[] shallowCopy = arrCopy1;
		
		shallowCopy[1] = 999;
		System.out.println(Arrays.toString(arrCopy1));
		System.out.println(Arrays.toString(shallowCopy));
		
//		깊은 복사
//		 - 새로운 배열 객체를 생성하고 기존의 배열 데이터를 복사하는 방식
//		int[] arrCopy2 = {1, 2, 3};
//		int[] deepCopy = new int[arrCopy2.length];
		
		deepCopy[0] = arrCopy2[0];
		deepCopy[1] = arrCopy2[1];
		deepCopy[2] = arrCopy2[2];
		
		System.arraycopy(arrCopy2, 0, deepCopy, 0, arrCopy2.length);
//		System.arraycopy(복사할 원본 배열, 복사를 시작할 위치, 저장할 배열, 저장
//		System.arraycopy(arrCopy2, 0, deepCopy, 0, arrCopy2.length);
		
		int[] arrCopy2 = {1, 2, 3};
		int[] deepCopy = Arrays.copyOf(arrCopy2, arrCopy2.length);
	}
}
