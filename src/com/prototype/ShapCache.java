package com.prototype;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;

/**
 * 原型模式
 *
 * @author lzy
 * @date 2018-8-6
 */
public class ShapCache {
    private static HashMap<String, Shap> shapHashMap = new HashMap<>();

    public static Shap getShap(String shapId) throws CloneNotSupportedException {
        Shap cacheShap = shapHashMap.get(shapId);
        return (Shap) cacheShap.clone();
    }
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapHashMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapHashMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapHashMap.put(rectangle.getId(),rectangle);
    }
}
