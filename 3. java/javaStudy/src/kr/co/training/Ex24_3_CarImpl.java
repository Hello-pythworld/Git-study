package kr.co.training;

public class Ex24_3_CarImpl implements Ex24_3_Car {
	
	public boolean isRunning = false; // 운행 상태 여부
	public int speed = 0;   // 자동차 속도
	
	public void start() {
		if(isRunning == false) {
			isRunning = true;
			System.out.println("자동차가 시작되었습니다.");
		} else {
			System.out.println("자동차가 이미 시작되어 있습니다.");
		}
	}
	public void stop() {
		if(isRunning == true) {
			isRunning = false;
			speed = 0;
			System.out.println("자동차가 정지되었습니다.");
		}
			else {
					System.out.println("자동차가 이미 정지되어 있습니다.");
			}
	}
	public void accelerate(int speed) {
		if(isRunning == true) {
			this.speed += speed;
			System.out.println("자동차가 " + speed + "km/h로 가속 중입니다.");
		} else {
			System.out.println("자동차가 정지 상태입니다. 먼저 시작하세요.");
		}
	}
	public void brake() {
		if(isRunning == true && speed > 0) {
			this.speed -= 10;
			System.out.println("자동차가 감속중입니다.");
		} else {
			System.out.println("자동차가 정지 상태입니다. 먼저 시작하세요.");
		}
	}
	public String getInfo() {
		String status = "";
		if(isRunning == true) {
			status = "운행 중";
		} else {
			status = "정지";
			
		}
		return "상태: " + status + ", 현재 속도: " + speed + "km/h";
	}
}
