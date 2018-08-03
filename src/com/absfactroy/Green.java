package com.absfactroy;

/**
 * 抽象工厂方法
 *
 * @author lzy
 * @date 2018-8-3
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("I am Green");
    }
}
