package com.ligz.iterator.food;

/**
 * @author ligz
 */
public class Test {
	public static void main(String[] args) {
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(dinerMenu);
		
		waitress.printMenu();
	}
}
