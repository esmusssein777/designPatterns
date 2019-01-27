package com.ligz.template.coffee;

/**
 * @author ligz
 */
public abstract class CaffeineBeverage {
	final void prepareRecipe() {//准备工作，将他设置成final，子类不会继承该类
		boilWater();//烧开水
		brew();//冲泡，不同的饮料不一样
		pourInCup();//倒入茶杯
		addCondiments();//将调料，不同的饮料不一样
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("pouring into cup");
	}
}
