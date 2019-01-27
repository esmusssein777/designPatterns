package com.ligz.Decorator.coffee;

public class Test {
	public static void main(String[] args) {
		Beverage beverage = new Decaf();
		System.out.println(beverage.getDescription() + "$" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Milk(beverage2);
		beverage2 = new Soy(beverage2);
		System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
		
		
	}
	
	
}
