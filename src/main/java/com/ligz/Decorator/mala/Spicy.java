package com.ligz.Decorator.mala;

/**
 * 麻辣
 * @author ligz
 */
public class Spicy extends Primer{
	public Spicy() {
		description = "麻辣";
	}

	@Override
	public double cost() {
		return 12;
	}
}
