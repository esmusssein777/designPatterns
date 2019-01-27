package com.ligz.Decorator.mala;

/**
 * 清汤
 * @author ligz
 */
public class Broth extends Primer{
	public Broth() {
		description = "清汤";
	}

	@Override
	public double cost() {
		return 10;
	}
	
}
