package kr.co.training;

public class Ex24_1_SportsCar implements Ex24_1_Car{

	@Override
	public void start() {
		System.out.println("스포츠카에 시동을 겁니다.");
	}
	@Override
	public void accelerate() {
		System.out.println("스포츠카를 가속합니다.");
	}
	@Override
	public void Brake() {
		System.out.println("스포츠카를 제동합니다.");
	}
}
