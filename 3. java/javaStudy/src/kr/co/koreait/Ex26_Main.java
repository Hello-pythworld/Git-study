package kr.co.koreait;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex26_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex26_1_Book book = new Ex26_1_Book("도서 관리 객체"); // 도서 관련 기능이 있는 객체
		ArrayList<Ex26_1_BookInfo> list = new ArrayList<>();
		
		while(true) {
			System.out.println("""
					1. 도서추가
					2. 도서삭제
					3. 도서 전체 조회
					4. 도서 검색
					0. 종료
					메뉴 :
					""");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 -> book.add(list);
			}
		}
	}

}
