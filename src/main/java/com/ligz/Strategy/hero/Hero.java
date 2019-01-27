package com.ligz.Strategy.hero;

public abstract class Hero {
	DFBehavior dBehavior;//使用D技能
	DFBehavior fBehavior;//使用F技能
	
	public Hero() {
		System.out.println("创建英雄");
	}
	
	public void DSkill() {
		dBehavior.skill();
	}
	
	public void FSkill() {
		fBehavior.skill();
	}
	
	public void fight() {
		System.out.println("打架");
	}
	
	/**
	 * 基础技能
	 */
	public abstract void Q();
	
	public abstract void W();
	
	public abstract void E();
	
	public abstract void R();
}
