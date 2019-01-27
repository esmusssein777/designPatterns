package com.ligz.Observer.weather;

/**
 * 观察者模式
 * 主题接口
 * @author ligz
 */
public interface Subject {
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObserver();

}
	
	
	

