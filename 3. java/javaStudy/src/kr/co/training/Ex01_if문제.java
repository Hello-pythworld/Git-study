package kr.co.training;

import java.util.Scanner;

public class Ex01_if문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//	Q1. 점수를 입력받아 60점 이상이면 "합격", 아니면 "불합격" 출력
//		System.out.println("점수를 입력해주세요!");
//		int score = sc.nextInt();
//		if (score >= 60) {
//			System.out.println("합격!");	
//		} else{
//			System.out.println("불합격!");;
//		}
//	Q2. 정수 하나를 입력받아 짝수인지 홀수인지 출력
//
//		System.out.println("양의 정수를 입력해주세요");
//		int positive_integer = sc.nextInt();
//		if (positive_integer %2 == 0) {
//			System.out.println("짝수입니다!");
//		} else {
//			System.out.println("홀수입니다!");
//		}
//		
//	Q3. 나이를 입력받아 20세 이상이면 "성인", 아니면 "미성년자" 출력
//
//		System.out.println("나이를 입력해주세요!");
//		int age = sc.nextInt();
//		if (age>=20) {
//			System.out.println("성인");
//		} else {
//			System.out.println("미성년자");
//		}
//		
		
//	Q4. 비밀번호가 "1234"이면 "로그인 성공", 아니면 "로그인 실패" 출력
//
//		System.out.println("패스워드를 입력해주세요!");
//		int password = sc.nextInt();
//		if(password == 1234) {
//			System.out.println("로그인 성공!");
//		} else {
//			System.out.println("로그인 실패!");
//		}
		
//	Q7. 나이를 입력받아 요금 출력
//	 - 12세 이하 : 3,000원
//	 - 18세 이하 : 5,000원
//	 - 19세 이상 : 10,000원
//
//		System.out.println("나이를 입력해주세요!");
//		int age = sc.nextInt();
//		if (age <= 12) {
//			System.out.println("3000원입니다!");
//		} else if (age <= 18) {
//			System.out.println("5000원입니다!");
//		} else if (age>=19) {
//			System.out.println("10000원입니다!");
//		}
//	Q8. 아이디와 비밀번호를 입력받아 아이디가 "admin"이고 비밀번호가 "1234"면 관리자 로그인 성공
//
//		System.out.println("아이디를 입력해주세요!");
//		String ID = sc.nextLine();
//		System.out.println("비밀번호를 입력해주세요!");
//		int password = sc.nextInt();
//		if(ID.equals("admin") && password == 1234) {
//			System.out.println("관리자 로그인 성공!");
//		}
//	Q9. 점수와 결석 여부를 입력받아 결과 출력
//	 - 결석 여부는 true, false로 받음
//	 - 결석이면 무조건 F
//	 - 90 이상 A
//	 - 80 이상 B
//	 - 70 이상 C
//	 - 그 외 F
//
//		System.out.println("출결을 true, false로 입력해주세요!");
//		String attendance_check = sc.nextLine();
//		System.out.println("점수를 입력해주세요!");
//		int score = sc.nextInt();
//		if(attendance_check.equals("false")) {
//			System.out.println("학점은 F입니다!");
//		} else if (attendance_check.equals("true") && score >=90) {
//			System.out.println("학점은 A입니다!");
//		} else if (attendance_check.equals("true") && score >= 80) {
//			System.out.println("학점은 B입니다!");
//		} else if (attendance_check.equals("true") && score >= 70) {
//			System.out.println("학점은 C입니다!");
//		} else {
//			System.out.println("학점은 F입니다!");
//		}
//	Q10. 스캐너로 사용자로부터 몇 월인지 입력 받으세요.
//	  - 해당하는 계절과 출력 메시지는 아래와 같습니다.
//	  - 3, 4, 5 : 봄
//	  - 6, 7, 8 : 여름
//	  - 9, 10, 11 : 가을
//	  - 12, 1, 2 : 겨울
//	  - 그 외 : 해당하는 계절이 없습니다.
//	        ex) 1을 입력 받을 경우 “겨울” 출력
//	             위의 예시를 활용하여 OR 연산자 또는 AND 연산자를 활용하여 문제를 풀어보세요.
//
		System.out.println("몇월인지 입력하세요!");
		int month = sc.nextInt();
		if(month == 3 || month ==  4 || month == 5) {
			System.out.println("봄입니다!");
		} else if(month == 6 || month == 7 || month == 8) {
			System.out.println("여름입니다!");
		} else if(month == 9 || month == 10 || month == 11) {
			System.out.println("가을입니다!");
		} else if(month == 12 || month == 1 || month == 2) {
			System.out.println("겨울입니다!");
		}
	}
}