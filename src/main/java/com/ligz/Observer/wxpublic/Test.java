package com.ligz.Observer.wxpublic;

public class Test {
	public static void main(String[] args) {
		WxPublic wxPublic = new WxPublic();
		
		System.out.println("三个用户关注公众号");
		Observer observer1= new Observer1(wxPublic);
		Observer observer2= new Observer2(wxPublic);
		Observer observer3= new Observer3(wxPublic);
		
		System.out.println("微信公众号更新文章一");
		wxPublic.UpdateContent("文章一");
		
		System.out.println("用户一取消关注");
		wxPublic.unsubscribeObserver(observer1);
		System.out.println("微信公众号更新文章二");
		wxPublic.UpdateContent("文章二");
		
		
	}
}
