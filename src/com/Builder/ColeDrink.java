package com.Builder;

/**
 * 建造者模式
 *
 * @author lzy
 * @date 2018-8-5
 */
public abstract class ColeDrink implements Iteam {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
