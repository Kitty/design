package com.prototype;

/**
 * 原型模式
 *
 * @author lzy
 * @date 2018-8-6
 */
public class Square extends Shap {
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
