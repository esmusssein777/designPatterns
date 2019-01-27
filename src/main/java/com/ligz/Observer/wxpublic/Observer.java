package com.ligz.Observer.wxpublic;

/**
 * 观察者模式
 * 所有的用户都需要实现这个接口，公众号在需要通知用户时，才有了 一个共同的接口
 * @author ligz
 */
public interface Observer {
	public void update(String content);
}
