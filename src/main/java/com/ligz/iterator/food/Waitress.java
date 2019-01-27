package com.ligz.iterator.food;

/**
 * @author ligz
 */
public class Waitress {
	DinerMenu dinerMenu;
	
	public Waitress(DinerMenu dinerMenu) {
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator dinIterator = dinerMenu.createIterator();
		printMenu(dinIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.getPrice());
		}
	}
}
