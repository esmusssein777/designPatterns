package com.ligz.Decorator.mala;

/**
 * @author ligz
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("只要一个清汤底料");
		Primer broth = new Broth();
		System.out.println(broth.getDescription()+"需要花"+broth.cost());
		
		
		System.out.println("我要一个麻辣底料和热狗在加生菜");
		Primer spicy = new Spicy();
		spicy = new HotDog(spicy);
		spicy = new Lettuce(spicy);
		System.out.println(spicy.getDescription()+"需要花"+spicy.cost());
	}
}
