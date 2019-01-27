package com.ligz.adapter.converter;

/**
 * 苹果耳机
 * author:ligz
 */
public class AppleHeadphone implements HeadphonePort{
    @Override
    public void listen() {
        System.out.println("我是苹果耳机，我可以听音乐");
    }
}
