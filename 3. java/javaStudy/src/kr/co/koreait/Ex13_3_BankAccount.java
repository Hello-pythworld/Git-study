package kr.co.koreait;

import java.util.Scanner;

public class Ex13_3_BankAccount {
	Scanner sc = new Scanner(System.in);
//	입금 메서드
//	 - 메서드명 : deposit
//	 - 매개변수 : 입금할 금액 (amount)
	public void deposit(int amount) {
		System.out.printf("%d원을 입금했습니다.\n", amount);
	}
	
//	출금 메서드
//	 - 메서드명 : withdraw
//	 - 매개변수 : 출금할 금액 (amount)
//	 - 출력형식 : "OOO원을 출금했습니다."
	public void withdraw(int num) {
		System.out.printf("%d원을 출금했습니다.\n", num);
	}
	
// 계좌 잔액 확인 메서드
//	- 메서드명 : checkBalance
//	- 매개변수 : 없음
//	- 반환 : "현재 잔액을 확인합니다."
	public String checkBalance() {
		return "현재 잔액을 확인합니다.";
	}
	
}	 
