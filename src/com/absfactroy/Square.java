package com.absfactroy;

/**
 * 抽象工厂方法
 *
 * @author lzy
 * @date 2018-8-3
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
