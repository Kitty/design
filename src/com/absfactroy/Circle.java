package com.absfactroy;

/**
 * 抽象工厂方法
 *
 * @author lzy
 * @date 2018-8-3
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside circle::draw() method.");
    }
}
