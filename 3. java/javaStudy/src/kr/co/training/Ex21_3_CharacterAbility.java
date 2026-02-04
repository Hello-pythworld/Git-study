package kr.co.training;

public class Ex21_3_CharacterAbility {
//	아래의 필드들을 가집니다.
//	 - 힘(str), 민첩(dex), 지력(knowledge)
	private int str;
	private int dex;
	private int knowledge;
	private int level = 1;
	private int hp = 100;
	private int mp = 100;
	private int exp = 0;
	
	public void setStr(int str) {
		this.str= str;
	}
	public void setDex(int dex) {
		this.dex= dex;
	}
	public void setKnowledge(int knowledge) {
		this.knowledge = knowledge;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int Mp) {
		this.mp = mp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}	
	public int getStr() {
		return str;
	}
	public int getDex() {
		return dex;
	}
	public int getKnowledge() {
		return knowledge;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getExp() {
		return exp;
	}
	
	public void addExp(int exp) {
		this.exp += exp;
	if (this.exp >= 100) {
		level++;
	}

	
}
//	   레벨(level, 초기값 1)
//	   경험치(exp, 100이 될 경우 레벨이 1 증가하고, 경험치는 0이 됨)
//	   체력(hp, 초기값 100, 레벨업을 해도 회복되지 않음
//	   마력(mp, 초기값 100, 레벨업을 해도 회복되지 않음
//	   - 모든 필드의 접근 제어자는 private
//	   - 각 필드에 대한 getter/setter 작성
//	   - 현재 능력치를 모두 확인할 수 있는 toString 오버라이딩 작성
//			> toString은 문자열을 반환합니다.
//			> public void toString() { return "문자열" }
		@Override
		public String toString() {
			return "str : "+ str +
					", dex : " + dex +
					", knowledge : " + knowledge +
					", hp : " + hp +
					", mp : " + mp +
					", exp : " + exp
					;
		}
		

}
