package com.ligz.Singleton;

/**
 * @author ligz
 */
public class Singleton {
	//利用一个静态变量来记录Singleton唯一的实例
	private static Singleton uniqueInstance;
	
	//将构造器设置为私有的，只有在Singleton类内才能调用构造器
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	//其他方法
}
