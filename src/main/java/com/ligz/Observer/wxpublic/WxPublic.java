package com.ligz.Observer.wxpublic;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * 微信公众号
 * @author ligz
 */
public class WxPublic implements Subject{
	private List<Observer> list;
	
	private String content;
	
	public WxPublic() {
		list = new ArrayList<Observer>();
	}

	public void subscribeObserver(Observer o) {
		list.add(o);
	}

	public void unsubscribeObserver(Observer o) {
		int index = list.indexOf(o);
		if(index >= 0) {
			list.remove(index);
		}
	}

	public void notifyObserver() {
		for(Observer o : list) {
			o.update(content);
		}
	}
	
	public void UpdateContent(String content) {
		this.content = content;
		notifyObserver();
	}

	
	
	
}
