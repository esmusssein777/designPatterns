package com.ligz.Strategy.duck;

/**
 * 继承抽象类
 * @author ligz
 */
public class MallardDuck extends Duck{
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("display");
		
	}
	
}
