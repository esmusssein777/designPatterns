package com.ligz.Decorator.coffee;

/**
 * 调料装饰者
 * @author ligz
 */
public class Milk extends CondimentDecorator{
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+",milk";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.10;
	}

}
