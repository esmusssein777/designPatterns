package com.ligz.adapter.converter;

/**
 * 耳机适配器
 * author:ligz
 */
public class HeadphoneAdapter implements ChargePort{
    HeadphonePort headphonePort;

    public HeadphoneAdapter(HeadphonePort headphonePort){
        this.headphonePort = headphonePort;
    }

    @Override
    public void charge() {
        System.out.println("我是充电的接口");
        System.out.println("通过耳机的适配器");
        headphonePort.listen();
    }
}
