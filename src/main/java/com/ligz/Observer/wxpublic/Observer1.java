package com.ligz.Observer.wxpublic;

/**
 * 观察者模式
 * 用户一
 * @author ligz
 */
public class Observer1 implements Observer, DisPlayContent{
	private String content;
	public Subject wxPublic;
	
	
	public Observer1 (Subject wxPublic) {
		this.wxPublic = wxPublic;
		wxPublic.subscribeObserver(this);
	}

	public void update(String content) {
		this.content =content;
		display();
	}

	public void display() {
		System.out.println("用户一接收到" + content);
	}

}
