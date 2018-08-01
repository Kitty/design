package com.factory;

/**
 * 工厂模式
 *
 * @author lzy
 * @date 2018-8-1
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
