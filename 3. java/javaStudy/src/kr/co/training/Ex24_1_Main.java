package kr.co.training;

public class Ex24_1_Main {

	public static void main(String[] args) {

		Ex24_1_SportsCar sc = new Ex24_1_SportsCar();
		Ex24_1_RegularCar rc = new Ex24_1_RegularCar();
		
		sc.start();
		sc.accelerate();
		sc.Brake();
		rc.start();
		rc.accelerate();
		rc.Brake();
	}

}
