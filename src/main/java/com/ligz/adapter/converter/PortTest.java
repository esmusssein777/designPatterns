package com.ligz.adapter.converter;

/**‘
 * 对象适配器测试
 * author:ligz
 */
public class PortTest {
    public static void main(String[] args) {
        ChargePort appleCharger = new AppleCharger();//先创建一个充电接口

        HeadphonePort appleHeadphone = new AppleHeadphone();//在创建一个耳机接口
        ChargePort headphoneAdapter = new HeadphoneAdapter(appleHeadphone);//再创建一个适配器

        appleCharger.charge();

        System.out.println("\n");

        appleHeadphone.listen();

        System.out.println("\n");

        headphoneAdapter.charge();

    }
}
