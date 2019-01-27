package com.ligz.Strategy.duck;

/**
 *   策略模式
 *   抽象类
 * @author ligz
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void preformFly() {
		flyBehavior.fly();
	}
	
	public void preformQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("all duck can swim!");
	}
}
