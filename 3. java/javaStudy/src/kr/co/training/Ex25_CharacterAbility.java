package kr.co.training;

public class Ex25_CharacterAbility {

	private int str = 0;
	private int dex = 0;
	private int knowledge = 0;
	private int level = 1;
	private int experience = 0;
	private int hp = 100;
	private int mp = 100;
	private int unusedStats = 0;
	private int hpPotionCount = 10;
	private int mpPotionCount = 10;
	
	public void setStr(int str) {
		this.str= str;
	}
	public void setDex(int dex) {
		this.dex= dex;
	}
	public void setKnowledge(int knowledge) {
		this.knowledge= knowledge;
	}
	public void setLevel(int level) {
		this.level= level;
	}
	public void setExperience(int experience) {
		this.experience= experience;
	}
	public void setHp(int hp) {
		this.hp= hp;
	}
	public void setMp(int mp) {
		this.mp= mp;
	}
	public void setUnusedStats(int unusedStats) {
		this.unusedStats= unusedStats;
	}
	public void setHpPotionCount(int HpPotionCount) {
		this.hpPotionCount= hpPotionCount;
	}
	public void setMpPotionCount(int mpPotionCount) {
		this.mpPotionCount= mpPotionCount;
	}
	
	public int getStr(int str) {
		return str;
	}
	public int getDex(int dex) {
		return dex;
	}
	public int getKnowledge(int knowledge) {
		return knowledge;
	}
	public int getLevel(int level) {
		return level;
	}
	public int getExperience(int experience) {
		return experience;
	}
	public int getHp(int hp) {
		return hp;
	}
	public int getMp(int mp) {
		return mp;
	}
	public int getUnusedStats(int unusedStats) {
		return unusedStats;
	}
	public int getHpPotionCount(int hpPotionCount) {
		return hpPotionCount;
	}
	public int getMpPotionCount(int mpPotionCount) {
		return mpPotionCount;
	}
}
