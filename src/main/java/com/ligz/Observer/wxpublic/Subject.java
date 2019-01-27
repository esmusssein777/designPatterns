package com.ligz.Observer.wxpublic;

/**
 * 观察者模式
 * 主题接口
 * @author ligz
 */
public interface Subject {
	public void subscribeObserver(Observer o);
	
	public void unsubscribeObserver(Observer o);
	
	public void notifyObserver();

}
	
	
	

