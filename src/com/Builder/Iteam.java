package com.Builder;

/**
 * 建造者模式
 *
 * @author lzy
 * @date 2018-8-5
 */
public interface Iteam {
    public String name();

    public Packing packing();

    public void price();
}
