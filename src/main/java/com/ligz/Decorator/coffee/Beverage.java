package com.ligz.Decorator.coffee;

/**
 * 装饰者模式
 * 相当于抽象的Component类
 * @author ligz
 */
public abstract class Beverage {
	String description = "no drink";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
