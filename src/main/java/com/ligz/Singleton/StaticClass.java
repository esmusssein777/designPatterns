package com.ligz.Singleton;

/**
 * 静态内部类的形式
 * author:ligz
 */
public class StaticClass {
    private static class Singleton {
        private static final StaticClass staticClass = new StaticClass();
    }

    private StaticClass(){};

    public static final StaticClass getInstance() {
        return Singleton.staticClass;
    }
}
