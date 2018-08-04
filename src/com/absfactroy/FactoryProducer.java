package com.absfactroy;

/**
 * 抽象工厂方法
 *
 * @author lzy
 * @date 2018-8-3
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String chice){
        if (chice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }if (chice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
