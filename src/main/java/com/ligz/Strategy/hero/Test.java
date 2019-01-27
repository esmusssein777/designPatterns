package com.ligz.Strategy.hero;

public class Test {
	public static void main(String[] args) {
		Hero ez = new EZ(); 
		ez.fight();
		ez.DSkill();
		ez.FSkill();
		
		System.out.println("+++++++++++++++");
		
		Hero vn = new VN();
		vn.fight();
		vn.DSkill();
		vn.FSkill();
	}
}
