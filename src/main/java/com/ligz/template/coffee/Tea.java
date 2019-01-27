package com.ligz.template.coffee;

/**
 * @author ligz
 */
public class Tea extends CaffeineBeverage{

	/* (non-Javadoc)
	 * @see org.ligz.DesignPatterns.Template.coffee.CaffeineBeverage#brew()
	 */
	@Override
	void brew() {
		System.out.println("steeping the tea");
	}

	/* (non-Javadoc)
	 * @see org.ligz.DesignPatterns.Template.coffee.CaffeineBeverage#addCondiments()
	 */
	@Override
	void addCondiments() {
		System.out.println("add lemon");
	}
	
}
