package com.prototype;

/**
 * 原型模式
 *
 * @author lzy
 * @date 2018-8-6
 */
public class Circle extends Shap {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}