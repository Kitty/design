package com.Builder;

/**
 * 建造者模式
 *
 * @author lzy
 * @date 2018-8-5
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "veg burger";
    }
}
