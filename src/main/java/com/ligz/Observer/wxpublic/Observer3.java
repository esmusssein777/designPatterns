package com.ligz.Observer.wxpublic;

/**
 * 观察者模式
 * 用户三
 * @author ligz
 */
public class Observer3 implements Observer, DisPlayContent{
	private String content;
	public Subject wxPublic;
	
	
	public Observer3 (Subject wxPublic) {
		this.wxPublic = wxPublic;
		wxPublic.subscribeObserver(this);
	}

	public void update(String content) {
		this.content =content;
		display();
	}

	public void display() {
		System.out.println("用户三接收到" + content);
	}

}
