package kr.co.training;

public class Ex21_1_Order {
//	number, amount, status 필드를 가집니다.
//	 - 접근 제어자 : private
//	 - number, status는 문자열, amount는 실수형
	
	private String number;
	private String status;
	private double amount;
//	필드 3개에 대한 getter / setter
//	 - amount 필드의 setter에서 주문 금액이 100.0 미만일 경우
//		"유효하지 않은 금액입니다." 출력 -> 0으로 초기화
//	 - 동일하게 amount 필드의 setter에서 주문 금액이 100.0 이상일 경우
//	 	"주문 번호 : OOO, 주문 금액 : OOO, 주문 상태 : OOO" -> 받은 주문 금액으로 초기화
	public void setNumber(String number) {
		this.number = number;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setAmount(double amount) {
		this.amount = amount;
		if(amount<100.0) {
			System.out.println("유효하지 않은 금액입니다.");
			this.amount = 0;
		} else if(amount>=100.0) {
			this.amount = amount;
			System.out.println("주문 번호 : " + number +", 주문 금액 : " + amount + ", 주문 상태 : " + status
					);
		}
	}
	public String getNumber() {
		return number;
	}
	public String getStatus() {
		return status;
	}
	public double getAmount() {
		return amount;
	}
	public void buy() {
		System.out.println("주문을 완료했습니다.");
		System.out.println("주문 번호는 : " + getNumber());
		System.out.println("주문 금액은 : " + getAmount());
		System.out.println("주문 상태는 : "  + getStatus());

	}
	
//	 주문 번호(number), 주문 금액(amount), 주문 상태(status)
//	 ex) "ORDER3", 120.5, "결제완료"
}
