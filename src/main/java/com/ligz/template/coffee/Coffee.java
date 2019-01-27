package com.ligz.template.coffee;

/**
 * @author ligz
 */
public class Coffee extends CaffeineBeverage{

	/* (non-Javadoc)
	 * @see org.ligz.DesignPatterns.Template.coffee.CaffeineBeverage#brew()
	 */
	@Override
	void brew() {
		System.out.println("fripping coffee");
	}

	/* (non-Javadoc)
	 * @see org.ligz.DesignPatterns.Template.coffee.CaffeineBeverage#addCondiments()
	 */
	@Override
	void addCondiments() {
		System.out.println("adding sugar and milk");
	}

}
