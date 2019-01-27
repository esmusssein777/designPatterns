package com.ligz.iterator.food;

/**
 * @author ligz
 */
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	
	int numberOfItems = 0;
	
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("炒饭", "扬州炒饭", false, 8.00);
		addItem("肉夹馍", "西安肉夹馍", false, 12.00);
		addItem("拉面", "兰州拉面", false, 7.00);
		addItem("大盘鸡", "新疆大盘鸡", false, 100.00);
	} 
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("menu is full");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
 
}
