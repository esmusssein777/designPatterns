package com.ligz.Strategy.hero;

public class VN extends Hero{
	public VN() {
		super();
		System.out.println("让我们来猎杀那些陷入黑暗中的敌人");
		dBehavior = new Falsh();
		fBehavior = new Cure();
	}

	@Override
	public void Q() {
		System.out.println("VN的q技能");
	}

	@Override
	public void W() {
		System.out.println("VN的w技能");
	}

	@Override
	public void E() {
		System.out.println("VN的e技能");
	}

	@Override
	public void R() {
		System.out.println("VN的r技能");
	}

}
