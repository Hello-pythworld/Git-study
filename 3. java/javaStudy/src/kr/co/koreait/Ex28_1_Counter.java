package kr.co.koreait;

public class Ex28_1_Counter {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}

}

// synchronized가 붙은 메서드를 호출하면 모니터락 획득
// 메서드 실행 -> 모니터락을 획득한 스레드는 메서드 실행
// 실행 되는 동안 다른 스레드는 모니터락을 획득할 수 없으므로 메서드 접근 불가