package kr.co.training;

public class Ex21_3_Sorceress extends Ex21_3_Character{
//	Character 클래스를 상속 받습니다.
	Ex21_3_Sorceress(Ex21_3_CharacterAbility ca) {
		ca.setStr(10);
		ca.setDex(7);
		ca.setKnowledge(35);
	}
	public Ex21_3_Sorceress() {
	}
//	소서리스 객체 생성 시 힘 10, 민첩7, 지력 35로 생성됩니다.
	Ex21_3_CharacterAbility ca = new Ex21_3_CharacterAbility();
	Ex21_3_Character c = new Ex21_3_Character();
	@Override
	public void attack() {
		if(ca.getHp()<10) {
			System.out.println("체력이 부족합니다.");
			return;
		}
		System.out.println("지팡이를 휘두릅니다.");
		ca.addExp(25);
		ca.setHp(-10);
		
	};
//	attack 메서드 (오버라이딩)
//	 - "지팡이를 휘두릅니다." 출력
//	 - 경험치 25 증가, 체력 10 감소
//	 - 체력이 10 미만일 경우, "체력이 부족합니다." 출력
	
	@Override
	public void skill() {
		if(ca.getMp()<23) {
			System.out.println("마력이 부족합니다.");
			return;
			
		}
		System.out.println("아이스 애로우를 사용합니다.");
		ca.addExp(37);
		ca.setMp(-23);
		System.out.printf("경험치 : %d 마력: %d", ca.getExp(), ca.getMp());
	}
//	skill 메서드 (오버라이딩)
//	 - "아이스 애로우를 사용합니다." 출력
//	 - 경험치 37 증가, 마력 23 감소
//	 - 마력이 23 미만일 경우 "마력이 부족합니다." 출력
	
	public void levelUp() {
		System.out.println("레벨업을 하여 지력이 5 증가합니다.");
		ca.setKnowledge(+5);
	}
//	 levelUp 메서드
//	  - "레벨업을 하여 지력이 5 증가합니다." 출력
//	  - 지력 5증가
	@Override
	public String toString() {
		return "힘 : " + ca.getStr() +
				"민첩 : " + ca.getDex() + 
				"지력 : " + ca.getKnowledge() +
				"체력 : " + ca.getHp() +
				"마력 : " + ca.getMp();
	}
	
}
