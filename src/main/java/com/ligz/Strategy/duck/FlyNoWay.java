package com.ligz.Strategy.duck;

/**
 * 实现，对应策略模式不同的算法族
 * @author ligz
 */
public class FlyNoWay implements FlyBehavior{
	public void fly() {
		System.out.println("i can not fly");
	}
}
