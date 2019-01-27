package com.ligz.adapter.converter;

/**
 * 苹果手机充电器
 * author:ligz
 */
public class AppleCharger implements ChargePort{
    @Override
    public void charge() {
        System.out.println("我是苹果充电器，我可以充电");
    }
}
