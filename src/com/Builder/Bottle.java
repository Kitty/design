package com.Builder;

/**
 * 建造者模式
 *
 * @author lzy
 * @date 2018-8-5
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
