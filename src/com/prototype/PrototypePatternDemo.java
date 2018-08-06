package com.prototype;

/**
 * 原型模式
 *
 * @author lzy
 * @date 2018-8-6
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapCache.loadCache();

        Shap clonedShap = (Shap) ShapCache.getShap("1");
        System.out.println("Shap : " + clonedShap.getType());

        Shap clonedShap2 = (Shap) ShapCache.getShap("2");
        System.out.println("Shap : " + clonedShap2.getType());

        Shap clonedShap3 = (Shap) ShapCache.getShap("3");
        System.out.println("Shap : " + clonedShap3.getType());
    }
}
