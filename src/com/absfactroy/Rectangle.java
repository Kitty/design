package com.absfactroy;

/**
 * 抽象工厂方法
 *
 * @author lzy
 * @date 2018-8-3
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside rectangle::draw() method.");
    }
}
