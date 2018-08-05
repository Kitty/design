package com.Builder;

/**
 * 建造者模式
 *
 * @author lzy
 * @date 2018-8-5
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 31.0f;
    }

    @Override
    public String name() {
        return "pepsi";
    }
}
