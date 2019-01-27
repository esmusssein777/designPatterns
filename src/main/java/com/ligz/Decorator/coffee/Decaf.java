package com.ligz.Decorator.coffee;

/**
 * 具体组件
 * 代表咖啡类型
 * @author ligz
 */
public class Decaf extends Beverage{
	
	public Decaf() {
		description = "decaf";
	}
	
	@Override
	public double cost() {
		return 1.11;
	}

}
