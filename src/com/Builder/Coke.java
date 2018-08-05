package com.Builder;
/**
 * 建造者模式
 *
 * @author lzy
 * @date 2018-8-5
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "coke";
    }
}
