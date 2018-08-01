package com.factory;

/**
 * 工厂模式
 *
 * @author lzy
 * @date 2018-8-1
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside rectangle::draw()method");
    }
}
