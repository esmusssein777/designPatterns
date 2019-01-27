package com.ligz.Strategy.hero;

public class EZ extends Hero{
	
	public EZ() {
		super();
		System.out.println("是时候展示真正的技术了");
		dBehavior = new Falsh();
		fBehavior = new TP();
	}

	@Override
	public void Q() {
		System.out.println("EZ的q技能");
	}

	@Override
	public void W() {
		System.out.println("EZ的w技能");
	}

	@Override
	public void E() {
		System.out.println("EZ的e技能");		
	}

	@Override
	public void R() {
		System.out.println("EZ的r技能");		
	}

}
