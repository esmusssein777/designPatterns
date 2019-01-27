package com.ligz.Decorator.coffee;

/**
 * 具体组件
 * 代表咖啡类型
 * @author ligz
 */
public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 2.22;
	}
	
	
}
